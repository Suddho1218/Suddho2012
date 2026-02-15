import java.util.*;
class Marks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double bio,chem,phy,eng,math,avg;
        System.out.println("Enter marks in Mathematics");
        math=sc.nextDouble();
        System.out.println("Enter marks in Physics");
        phy=sc.nextDouble();
        System.out.println("Enter marks in Chemistry");
        chem=sc.nextDouble();
        System.out.println("Enter marks in Biology");
        bio=sc.nextDouble();
        System.out.println("Enter marks in English");
        eng=sc.nextDouble();
        avg=(math+phy+chem+bio+eng)/5;
        if (avg>=80)
        System.out.println("You Can take Computer Science");
        else
        System.out.println("You can take Biology");
    }
}