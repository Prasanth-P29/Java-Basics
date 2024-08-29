class computer
{
    int num = 5;
    public int add(int n1,int n2)
    {
        System.out.println(num);
        return n1+n2;
    }
}
class StackHeap {
    public static void main(String a[]) {
        int data = 10;
        computer obj = new computer();
        computer obj1 = new computer();
        //int result = obj.add(29,7);
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}
