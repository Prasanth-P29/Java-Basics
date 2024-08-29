class calculator
{
    int a;
    public int add(int n1,int n2)
    {
        //int a;
        //System.out.println("in add");
        //return 0;

        //int r=num1+num2;
        //return r;
        int r = n1+n2;
        return r;
    }


}
class clasObj
{
    public static void main(String args[])
    {
        int num1 = 29;
        int num2 = 7;
        calculator calc = new calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);

    }

}
// Object Oriented programming
// Object - Properties and Behaviors

//Class