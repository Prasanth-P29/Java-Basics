class E
{
    public void show1(){

        System.out.println("In E show");
    }
}
class F extends E
{
    public void show2(){

        System.out.println("In F show");
    }
}
class UpDownCasting
{
    public static void main(String a[])
    {
     //E obj = new E();
     //E obj = (E)new F();   new F() is typecast to E and it is basically upcasting.
     E obj = new F(); //Upcasting
     obj.show1();

     F obj1 = (F)obj; //Downcasting
     obj1.show2();

    }
}