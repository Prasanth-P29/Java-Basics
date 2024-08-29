class Human1
{
    int Age;
    String Name;
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        //Human obj1=obj;
        //obj1.Age=Age;
        this.Age = Age;
    }

    //	public void SetAge(int a)
    //	{
    //		age=a;
    //	}

    public String getName()
    {
        return Name;
    }

    //	public void setName(String n)
    //	{
    //		name=n;
    //	}

    public void setName(String Name)
    {
        this.Name = Name;
    }


}
class This_Key
{
    public static void main(String args[])
    {
        Human1 obj = new Human1();

        //obj.SetAge(30,obj); we don't have to mention obj in the parameters that's why we using "this" keyword.
        obj.setAge(20);
        obj.setName("Prasanth");
        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}




