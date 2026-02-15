import java.util.*;
class Square
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double s,p,a;
        System.out.println("Enter side");
        s=sc.nextDouble();
        a=Math.pow(s,2);
        p=4*s;
        System.out.println("Area = "+a);
        System.out.println("Perimeter = "+p);
    }
}