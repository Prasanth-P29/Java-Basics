class mobile {
    String Brand;
    int Prize;
    static String Name;

    public void show()
    {
        System.out.println(Brand + " : " + Prize + " : " + Name);
    }
}

class statickey
{
    public static void main(String args[])
    {
        mobile obj1 = new mobile();
        obj1.Brand = "Xiomi";
        obj1.Prize = 15000;
        //obj1.name="SmartPhone";
        mobile.Name = "Smartphone";

        mobile obj2 = new mobile();
        obj2.Brand = "Apple";
        obj2.Prize = 100000;
        //obj2.name="SmartPhone";
        mobile.Name = "Smartphone";

        //obj1.Name = "Phone";
        mobile.Name = "Phone";

        obj1.show();
        obj2.show();
    }
}
