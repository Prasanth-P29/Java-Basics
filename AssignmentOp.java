class assignmentOp
{
    public static void main(String a[])
    {
        int num1 = 7;
        int num2 = 5;
        int result1 = num1 + num2;
        System.out.println(result1);


        int num3 = 7;
        int num4 = 5;
        int result2 = num3 - num4;
        System.out.println(result2);


        int num5 = 7;
        int num6 = 5;
        int result3 = num5 * num6;
        System.out.println(result3);


        int num7 = 7;
        int num8 = 5;
        int result4 = num7 / num8;
        System.out.println(result4);


        int num9 = 7;
        int num10 = 5;
        int result5 = num9 % num10;
        System.out.println(result5);


        int num =7;
       // num = num+2;
       // num+=2;
       // num*=2;

        num++;        //post increment
        ++num;        //pre increment
        num--;        //post decrement
        --num;        //pre decrement
        System.out.println(num);


        /*
         * int result = num++;       (first fetch the value and then increment)
         * int result = ++num;       (increment the value first and then assign to it)
         * same for the post and pre decrement.
         */
    }
}