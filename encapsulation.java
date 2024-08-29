class Human
{
    //int age;
    //private int age=20;
    //String name;
    //private String name="Prasanth";

    private int Age;
    private String Name;
    public int getAge()
    {
        return Age;
    }
    public void setAge(int a)
    {
        Age = a;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String n)
    {
        Name = n;
    }
}
class encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();
        //obj.age=20;
        //obj.name="Prasanth";
        obj.setAge(20);
        obj.setName("Prasanth");
        System.out.println(obj.getName() +" : " + obj.getAge());


    }
}
/*
we are binding our data with the methods.

The only way to access that data is with methods.

So no one from the outside world can use

your variables directly. we are encapsulating the data and methods

and that is Encapsulation.
*/