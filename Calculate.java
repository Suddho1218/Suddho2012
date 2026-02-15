import java.util.*;
class Calculate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,sum,avg;
        System.out.println("Enter three numbers");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        sum=a+b+c;
        avg=sum/3;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}