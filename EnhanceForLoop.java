class students
{
    int rollNo;
    String name;
    int marks;

}

class EnhanceLoop
{
    public static void main(String a[])
    {
        students s1 = new students();
        s1.rollNo = 7;
        s1.name = "prasanth";
        s1.marks = 70;

        students s2 = new students();
        s2.rollNo = 8;
        s2.name = "haaris";
        s2.marks = 80;

        students s3 = new students();
        s3.rollNo = 9;
        s3.name = "anas";
        s3.marks = 90;

        students Student[] = new students[3];
        Student[0] = s1;
        Student[1] = s2;
        Student[2] = s3;

        for(students stud: Student)
        {
            System.out.println(stud.rollNo + " - " + stud.name + " : " + stud.marks);
        }


//		int nums[] = new int[6];
//		nums[0]=4;
//		nums[1]=8;
//		nums[2]=3;
//		nums[3]=9;
//
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.println(nums[i]);
//			}
    }
}

