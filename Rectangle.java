import java.util.*;
class Rectangle
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        double l,b,area,perimeter;
        System.out.println("Enter the length");
        l=sc.nextDouble();
        System.out.println("Enter the breadth");
        b=sc.nextDouble();
        area=l*b;
        perimeter=2*(l+b);
        System.out.println("Perimeter ="+perimeter);
        System.out.println("Area ="+area);
        
    }
        
    
}