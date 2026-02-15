import java.util.*;
class Mega_Mart
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double c,d,a;
        System.out.println("Enter total cost");
        c=sc.nextDouble();
        if (c<=2000)
        d=5.0/100.0*c;
        else if(c>=2001 && c<=5000)
        d=10.0/100.0*c;
        else if(c>=5001 && c<=10000)
        d=15.0/100.0*c;
        else
        {
            d=20.0/100.0*c;
        }
    
        a=c-d;
        System.out.println("Discount = ₹"+d);
        System.out.println("Amount = ₹"+a); 
    }
}