import java.util.*;
class Vowel
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    char ch;
    System .out.println("Enter a letter");
    ch=sc.next().charAt(0);
    if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    System.out.println("It is a Vowel");
    else
    System.out.println("It is not a vowel");
    }    
}