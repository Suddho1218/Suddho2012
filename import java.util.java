import java.util.*;
class Compound_Interest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double p,r,a1,a2,a3,si1,si2,si3,ci;
        System.out.println("Enter Principal");
        p=sc.nextDouble();
        System.out.println("Enter Rate");
        r=sc.nextDouble();
        si1=(p*r*1)/100;
        a1=si1+p;
        si2=(a1*r*1)/100;
        a2=si2+a1;
        si3=(a2*r*1)/100;
        a3=si3+a2;
        ci=a3-p;
        System.out.println("Interest for first year = ₹"+si1);
        System.out.println("Amount at end of the first year = ₹"+a1);
        System.out.println("Interst for second year = ₹"+si2);
        System.out.println("Amount at the end of the second year = ₹"+a2);
        System.out.println("Interest of the third year = ₹"+si3);
        System.out.println("Amount at the end of the second year = ₹"+a3);
        System.out.println("Compound interest = ₹"+ci);
    }
}