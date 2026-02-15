import java.util.*;
class Temperature
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double c,f;
        System.out.println("Enter your body temperature in celsius");
        c=sc.nextDouble();
        f=1.8*c+32;
        if (f>98.6)
        System.out.println("Fever");
        else
        System.out.println("Normal");
    }
}