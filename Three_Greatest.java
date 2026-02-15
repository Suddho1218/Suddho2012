import java.util.*;
class Three_Greatest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,g;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>c&&a>b)
        {
            System.out.println("The greatest number = "+a);
        }
        else if(c>a&&c>b)
        {
            System.out.println("The Graetest number = "+c);
        }
        else
        {
            System.out.println("The Greatest number = "+b);
        }
    }
}