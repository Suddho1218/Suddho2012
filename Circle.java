import java.util.*;
class Circle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double r,c,a;
        System.out.println("Enter the radius");
        r=sc.nextDouble();
        c=2*22/7*r;
        a=22/7*Math.pow(r,2);
        System.out.println("Circumference  = "+c);
        System.out.println("Area = "+a);
    }
}