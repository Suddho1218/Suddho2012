import java.util.*;
class Swap_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The first valkue after swapping = "+a);
        System.out.println("The second value after Swapping = "+b);
    }
}