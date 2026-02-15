import java.util.*;
class Swap3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("First number after swapping = "+a);
        System.out.println("Second number after swapping = "+b);
    }
}