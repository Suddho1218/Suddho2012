import java.util.*;
class Vote
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=18)
        System.out.println("Eligible to vote");
        else
        System.out.println("Not Eligible to vote");
    }
}