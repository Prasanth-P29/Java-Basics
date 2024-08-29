class stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Prasanth");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Kumar");
        System.out.println(sb);



       // String str = sb.toString();
       // sb.deleteCharAt(6);
       // sb.insert(0,"Java");
        sb.insert(9,"Java ");
       // sb.setLength(30);
        sb.ensureCapacity(100);


        System.out.println(sb);


    }
}