class student
{
    int rollNo;
    String name;
    int marks;

}

class arrayObjects
{
    public static void main(String a[])
    {
        student s1 = new student();
        s1.rollNo = 7;
        s1.name = "prasanth";
        s1.marks = 70;

        student s2 = new student();
        s2.rollNo = 8;
        s2.name = "haaris";
        s2.marks = 80;

        student s3 = new student();
        s3.rollNo = 9;
        s3.name = "anas";
        s3.marks = 90;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollNo + " - " + students[i].name + " : " + students[i].marks);
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