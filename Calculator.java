import java.util.*;
class Calculator
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double a,b,res;
        char ch;
        System.out.println("Enter Two Numbers");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("Enter+for addition,-for subtracton,*for mulltication,/for division");
        ch=sc.next().charAt(0);
        if (ch=='+')
        {
            res=a+b;
            System.out.println(a+"+"+b+" = "+res);
        }
        else if (ch=='-')
        {
            res=a-b;
            System.out.println(a+"-"+b+" = "+res);
        }
        else if (ch=='*')
        {
            res=a*b;
            System.out.println(a+"*"+b+" = "+res);
        }
        else if (ch=='/')
        {
            res=a/b;
            System.out.println(a+"/"+b+" = "+res);
        }
    }
}