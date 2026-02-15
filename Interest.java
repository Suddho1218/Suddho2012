import java.util.*;
class Interest
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double p,r,t,SI,CI,ACI,ASI,PACI,PCI;
        int pe;
        System.out.println("Enter Principal");
        p=sc.nextDouble();
        System.out.println("Enter Rate");
        r=sc.nextDouble();
        System.out.println("Enter Time");
        t=sc.nextDouble();
        System.out.println("Enter Period");
        pe=sc.nextInt();
        SI=p*r*t/100;
        ASI=p+SI;
        ACI=p*(Math.pow((1+r/100),t));
        CI=ACI-p;
        if (pe==1)
        {
        System.out.println("Compound Interest = ₹"+CI);
        System.out.println("Amount of Compound Interest = ₹"+ACI);
        System.out.println("Simple Interest = ₹"+SI+"\nAmount of Simple Interest = ₹"+ASI);
        }
        else
        {
          PACI = p*(Math.pow((1+r/(100*pe)),t*pe));
          PCI = PACI-p;
          System.out.println("Compound Interest = ₹"+PCI);
          System.out.println("Amount of Compound Interest = ₹"+PACI);
          System.out.println("Simple Interest = ₹"+SI+"\nAmount of Simple Interest = ₹"+ASI);
        }
        }
    }
