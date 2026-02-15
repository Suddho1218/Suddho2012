import java.util.*;
class Students
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int b,g,pb,pg,t;
        System.out.println("Enter number of boys");
        b=sc.nextInt();
        System.out.println("Enter number of girls");
        g=sc.nextInt();
        t=b+g;
        pb=(b*100)/t;
        pg=(g*100)/t;
        System.out.println("Total Students = "+t);
        System.out.println("Percentage of boys = %"+pb);
        System.out.println("Percentage of girls = %"+pg);
    }
}