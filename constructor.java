class Human2
{
    int age;
    String name;

    public Human2() {
        age = 20;
        name = "Prasanth";
    }

    public Human2(String name) {
        this.name = name;
    }

    public Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }


//    public Human2()          // Default Constructor
//    {
//        Name = "Vikram";
//        Age = 50;
//        //System.out.println("In Constructor");
//    }

//    public Human2(int a,String n)
//    {
//        age = a;
//        name = n;
//    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }


}
class constructor
{
    public static void main(String args[]) {
        Human2 obj = new Human2();
      //Human2 obj1 = new Human2();
        System.out.println(obj.getName() + " : " + obj.getAge());

        //obj.setAge(20);
       //obj.setName("Prasanth");
       //System.out.println(obj.getName() + " : " + obj.getAge());


    }
}