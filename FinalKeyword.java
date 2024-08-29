//final - variables, methods, class

//final class calcu ---> final class ,it will stop inheritance.
class Calcu
{
    //public final void show() --->final method, it will stop the method overriding.
    public  void show(){
        System.out.println("By John");
    }
    public void add(int n1,int n2){
        System.out.println(n1 + n2);
    }
}
class AdvCalcu extends Calcu
{
    public void show(){
        System.out.println("By Prasanth");
    }
    public  void add(int a,int b){
        System.out.println(a + b);
    }
}
class FinalKeyword
{
    public static void main(String a[]){
        //final int num = 8;  --->final variable, once we use the final keyword in variable and the value will be constant.
        //num = 9;
        //System.out.println(num);
        AdvCalcu obj = new AdvCalcu();
        obj.show();
        obj.add(4,7);
    }
}