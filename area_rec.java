import java.util.*;
class area_rec
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        double l,b,a;
        System.out.println("Enter the length");
        l=sc.nextDouble();
        System.out.println("Enter the braedth");
        b=sc.nextDouble();
        a=l*b;
        System.out.println("Area of Rectangle = "+a);
    }
}