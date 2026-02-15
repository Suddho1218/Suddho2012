import java.util.*;
class Greatest
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int x,y,z;
        System.out.println("Enter three numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if (x>y && x>z)
        System.out.println(x+" Is the greatest number");
        else if (y>x && y>z)
        System.out.println(y+" Is the greatest number");
        else
        System.out.println(z+" Is the greatest Number");
    }
}