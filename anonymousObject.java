class AB
{
    public AB()
    {
        System.out.println("object created");
    }
    public void show() {
        System.out.println("In A show");
    }

}
class anonymousObject
{
   public static void main(String args[])
   {
       int marks;
       marks = 99;
       //new AB(); // ---> (Anonymous Object)
       new AB().show();
       //new AB().show();

       //AB obj = new AB();
       //AB obj;
       //obj = new AB();

       //obj.show();
   }



}