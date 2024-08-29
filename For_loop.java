class For_loop
{
    public static void main(String args[])
    {
        
        for(int a=0;a<=4;a++)
        {
            System.out.println("Hi"+ a);
        }



        int b=1;
        for(;b<=5;)
        {
            System.out.println("DAY"+b);
            b++;
        }





        //Example 2:
        for(int i = 1; i<=5; i++)
        {
            System.out.println("Day " + i);
            for(int j = 1;j<=9; j++)
            {
                System.out.println("  " + (j+8)+" - "+ (j+9));
            }
        }
        System.out.println("Day 6 is Holiday");
        System.out.println("Day 7 is Holiday");
    }
}