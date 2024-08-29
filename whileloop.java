class whileloop
{
    public static void main(String args[])
    {

//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}


//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);

    //Example 2:
        int a = 1;
        while(a<=4)
        {
            System.out.println("Hi "+ a);
            int b=1;
            while(b<=3) {
                System.out.println("Hello "+b);
                b++;
            }
            a++;
        }
        System.out.println("Bye "+a);



    //Example 2:
        int i = 1;

        while(i<=4) {
            System.out.println("Day " + i);
               int j = 1;
               while(j<=3)
               {
                   System.out.println("Goal " + j);
                   j++;
               }
            i++;
        }
        System.out.println("Be Better " + i);
    }
}