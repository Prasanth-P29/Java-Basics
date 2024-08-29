class array
{
    public static void main(String a[])
    {
        //int nums[] = {7,2,29,27}
        //nums[1]=6;
		//System.out.println(nums[1]);


        int nums[] = new int[4];
        nums[0] = 7;
        nums[1] = 2;
        nums[2] = 29;
        nums[3] = 27;
//      System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);

        for(int i = 0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
    }
}