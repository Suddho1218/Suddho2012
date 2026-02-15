import java.util.*;
class SES
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int c;
        char s;
        System.out.println("Enter Your Name:");
        n = sc.nextLine();
        System.out.println("Enter Your Class:");
        c = sc.nextInt();
        System.out.println("Enter Your Section:");
        s = sc.next().charAt(0);
        System.out.println(n+" is a student of St.Edmudnds School, student of class "+c+s);
    }
}