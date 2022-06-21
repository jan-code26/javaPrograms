 //palindrome or not
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String s=sc.nextLine();
            int n=s.length();
            int i=0,j=n-1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    System.out.println("Not a palindrome");
                    break;
                }
                i++;
                j--;
            }
            if(i==j)
            {
                System.out.println("Palindrome");
            }
        }
    }
}