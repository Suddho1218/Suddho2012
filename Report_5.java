import java.util.*;
class Report_5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double s1,s2,s3,s4,s5,tot,marks;
        System.out.println("Enter the marks in 5 subjects");
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        s3=sc.nextDouble();
        s4=sc.nextDouble();
        s5=sc.nextDouble();
        tot = s1+s2+s3+s4+s5;
        marks=tot/5;
        System.out.println("Marks = "+marks);
        System.out.println("Total = "+tot);
    }
}