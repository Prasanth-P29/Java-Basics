class Calculator
{
  public int add(int n1,int n2,int n3)
  {
      return n1+n2+n3;
  }

  public int add(int n1,int n2)
  {
      return n1+n2;
  }
  public double add(double n1,int n2)
  {
      return n1+n2;
  }
}
class methodOverload // MethodOverloading means it have the same method name but different type of parameters.
{
    public static void main(String args[])
    {
       Calculator Obj = new Calculator();
       int result = Obj.add(22,5,2);
       double result1 = Obj.add(22.5,7);
       int result2 = Obj.add(2,29);

       System.out.println(result);

       System.out.println(result1);

       System.out.println(result2);
    }
}