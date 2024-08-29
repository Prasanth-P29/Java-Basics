class jagged_array
{
    public static void main(String a[])
    {
        int num[][] = new int[3][];//Jagged array
        num[0] = new int[4];
        num[1] = new int[5];
        num[2] = new int[3];

        //	int nums[][]=new int [3][4][5]; // three dimensional array
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] = (int)(Math.random()*10);
            }
        }
        for(int n[]:num)//enhanced for loop
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}