class Mobile {
    String Brand;
    int Prize;
    static String Name;

    public void show()
    {
        System.out.println(Brand + " : " + Prize + " : " + Name);
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.Brand + " : " + obj.Prize + " : " + obj.Name);
    }

}

class staticmethod
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Xiomi";
        obj1.Prize = 15000;
        //obj1.name="SmartPhone";
        Mobile.Name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Apple";
        obj2.Prize = 100000;
        //obj2.name="SmartPhone";
        Mobile.Name = "Smartphone";

        obj1.Name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
/*
                            STATIC BLOCK
class Mobile{
	String brand;
	int price;
	String network;
	static String name;

	static {
		name="Phone";
		System.out.println("in static block");       static block is used to initialize the static variables.
	}

    	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}

	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}


}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{

		Class.forName("Mobile");     //forName is a method,and it's a static method.
		                            // load the system class loader to load this class.

//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//
//		Mobile obj2=new Mobile();


	}
}
 */