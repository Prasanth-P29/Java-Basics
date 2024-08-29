/*Polymorphism:
        - Many behaviour ( same object or reference has different behaviours)

1. Compile time polymorphism -- Overloading
add(int, int)
add(int, int, int)

2. Run time polymorphism -- Overriding
        A
add(int,int)
B
add(int, int)
 */
class Comp
{
    public void show(){
        System.out.println("In Computer Show");
    }
}
class Laptop extends Comp
{
    public void show(){
        System.out.println("In Laptop Show");
    }
}
class Tablet extends Comp
{
    public void show(){
        System.out.println("In Tablet Show");
    }
}
class MobilePhone extends Comp
{

}
class Polymorphism
{
    public static void main(String a[])
    {
        //Comp = new Laptop();
        //obj.show();

        Comp obj = new Comp();    // line 43 - 50 -->Dynamic Method Dispatch , which is other run time polymorphism.
        obj.show();

        obj = new Laptop();
        obj.show();

        obj = new Tablet();
        obj.show();

     
    }
}
