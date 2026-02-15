import java.util.*;
class Check
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            d=a*a*a;
            e=b*b;
            f=c+c;
        }
        else if(b>a && b>c)
        {
            d=b*b*b;
            e=a*a;
            f=c+c;
        }
        else
        {
            d=c*c*c;
            e=b*b;
            f=a+a;
        }
        System.out.println("d="+d+"\n e="+e+"\n f="+f);
    }
}