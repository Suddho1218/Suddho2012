import java.util.*;
class ProfitLoss
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double cp,sp,p,l,pp,lp;
        System.out.println("Enter cost price:");
        cp=sc.nextDouble();
        System.out.println("Enter selling price:");
        sp=sc.nextDouble();
        if(cp>sp)
        {
            l=cp-sp;
            lp=((cp-sp)/100)*100;
            System.out.println("Loss = "+l+" and Loss% = "+lp+"%");
        }
        else
        {
            p=sp-cp;
            pp=((sp-cp)/100)*100;
            System.out.println("Profit = "+p+" and Profit% = "+pp+"%");
        }
        
    }
}