import java.util.*;
class Swap
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The first value after swapping = "+a);
        System.out.println("The second valuej after Swapping = "+b);
    }
}