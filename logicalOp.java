class logicalOp
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 5;

        int a = 29;
        int b = 7;


        //		boolean result= x>y && a<b ;
		boolean result= x>y || a<b ;
		boolean result1= x>y && a>b ;
		boolean result2= x>y || a>b ;
		boolean result3= x<y && a<b ;
		boolean result4= x<y || a<b ;
		boolean result5= x<y || a<b || a>1 ;

		System.out.println(result);



        System.out.println(result);

        System.out.println(result1);

        System.out.println(result2);

        System.out.println(result3);

        System.out.println(result4);

        System.out.println(result5);

    }
}