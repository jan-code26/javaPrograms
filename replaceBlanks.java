//replace blanks with %20 in a string
import java.util.*;
class replaceBlanks
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string");
            String s=sc.nextLine();
            int n=s.length();
            int i=0,j=0;
            while(i<n)
            {
                if(s.charAt(i)==' ')
                {
                    j=j+3;
                }
                else
                {
                    j++;
                }
                i++;
            }
            char a[]=new char[j];
            i=0;
            j=0;
            while(i<n)
            {
                if(s.charAt(i)==' ')
                {
                    a[j]='%';
                    a[j+1]='2';
                    a[j+2]='0';
                    j=j+3;
                }
                else
                {
                    a[j]=s.charAt(i);
                    j++;
                }
                i++;
            }
            String str=new String(a);
            System.out.println("The string after replacement is "+str);
        }
    }
}