class A //extends Object
{
    public A()       // Default constructor
    {
        super();  // If we don't mention the super method it's already there.If we want parameterised constructor, explicitly we have to do it.
        System.out.println("In A");
    }
    public A(int n)   // Parameterised Constructor
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {
        super();//super() method means call the constructor of the superclass which is default constructor.
                //If we pass the value in super method then it call the parameterised constructor.
        System.out.println("In B");
    }
    public B(int n)
    {
        this(); // this() method means call the constructor of the same class.
        System.out.println("In B int");
    }
}
class ThisAndSuper
{
    public static void main(String a[])
    {
      //B obj = new B();
        B obj = new B(5);

    }
}