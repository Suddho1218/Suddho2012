import java.util.*;
class Evenodd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("Even number");
        else
        System.out.println("Odd number");
    }
}