class switchstat {
    public static void main(String args[]) {
        //		int n=1;
//		if(n==1)
//			System.out.println("Monday");
//		else if(n==2)
//			System.out.println("Tuesday");
//		else if(n==3)
//		System.out.println("Wednesday");
//		else if(n==4)
//		System.out.println("Thursday");
//		else if(n==5)
//		System.out.println("Friday");
//		else if(n==6)
//		System.out.println("Saturday");
//		else
//		System.out.println("Sunday");

     //Example 1:

        int a = 8;
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");

        }

    //Example 2:

        String n = "thursday";

        switch (n) {
            case "monday":
                System.out.println("Sambar");
                break;
            case "tuesday":
                System.out.println("curd rice");
                break;
            case "wednesday":
                System.out.println("parotta");
                break;
            case "thursday":
                System.out.println("VegBriyani");
                break;
            case "friday":
                System.out.println("tomato rice");
                break;
            case "saturday":
                System.out.println("Chappathi");
                break;
            case "sunday":
                System.out.println("ChickenBriyani");
                break;
            default:
                System.out.println("maggie");


        }

    }
}
