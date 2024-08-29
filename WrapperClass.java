class WrapperClass
{
    public static void main(String a[])
    {
        int num = 7;
     // Integer num1 = new Integer(8); It's not a good way to assign value.

     // Integer num1 = 8; we can directly assign the value.

     // Integer num1 = new Integer(num);   We are taking a primitive value and storing that in a primitive Object, or in a wrapper object,
     //                                    in a class object and this concept is called "boxing".

        Integer num1 = num; // you can directly assign num now and this Boxing is happening Automatically. num is a primitive type
     //                        and num1 isn't reference variable,it should be an object. So this will be getting converted
     //                        Automatically and that we say "Autoboxing".

        System.out.println(num1);

     // int num2 = num1.intValue();   in this case,we get value from object so use methods to get the value.
     //                               you are getting the value from the Object type to a primitive type.This is called Unboxing.

        int num2 = num1;//  you can directly assign num1 and since this is happening automatically, we call this "Auto-Unboxing".

        System.out.println(num2);

        String str = "27";

        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);

    }
}