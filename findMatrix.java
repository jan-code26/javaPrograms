//search in 2d matrix for a given value 
//every row is sorted from left to right
//every colom is sorted from top to bottom
import java.util.*;
class findMatrix
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int n=sc.nextInt();
            System.out.println("Enter the number of columns");
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the element to be searched");
            int x=sc.nextInt();
            int i=0,j=m-1;
            while(i<n && j>=0)
            {
                if(a[i][j]==x)
                {
                    System.out.println("Element found at "+i+" "+j);
                    break;
                }
                else if(a[i][j]>x)
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
            if(i==n || j==-1)
            {
                System.out.println("Element not found");
            }
        }
    }
}