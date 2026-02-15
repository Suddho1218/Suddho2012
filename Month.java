import java.util.*;
class Month
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter month number");
        m=sc.nextInt();
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        System.out.println("It has 31 days");
        else if(m==2)
        System.out.println("It has 28 days usually but has 29 dayson a leap year");
        else if(m==4||m==6||m==9||m==11)
        System.out.println("It has 30 days");
        else
        System.out.println("No such month exists");
    }
}
