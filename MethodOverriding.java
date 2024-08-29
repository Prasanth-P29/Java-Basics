class C
{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class D extends C
{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
/* class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

 */
class MethodOverriding //MethodOverriding means it have the same method name,same type of parameters,but it'll have different behaviour.
{
    public static void main(String args[])
    {
        D obj = new D();
        //obj.show();
        //obj.config();
        //AdvCalc obj=new AdvCalc();
        int r1 = obj.add(9,3);
        System.out.println(r1);
    }
}