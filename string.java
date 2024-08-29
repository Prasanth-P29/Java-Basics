/*class string
{
    public static void main(String a[])
    {
        String name = new String("prasanth");
        System.out.println(name);
        name = name + " kumar"; //it can't change the existing data in name variable
        System.out.println("Hello " + name);
        String s1 = "Prasanth";
        String s2 = "Prasanth";
        System.out.println( s1 == s2);
    //    System.out.println(name.hashCode());   give hashcode value
    //    System.out.println(name.charAt(3));    print index 3 value in String
    //    System.out.println(name.concat(" kumar"));

    // String name = Prasanth;


    }
}*/
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                byte x=sc.nextByte();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");

                short y = sc.nextShort();
                System.out.println(y+" can be fitted in:");
                if(y>=-32768 && y<=32768)System.out.println("* short");

                int z = sc.nextInt();
                System.out.println(y+" can be fitted in:");
                if(z>=-2_147_483_648  && z<=2_147_483_647)System.out.println("* int");

                long a = sc.nextLong();
                System.out.println(y+" can be fitted in:");
                if(a>= )System.out.println("* long");

                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}