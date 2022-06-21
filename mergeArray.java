//merge two sorted arrays into one sorted array
import java.util.*;
class mergeArray
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in first array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements of first array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the number of elements in second array");
            int m=sc.nextInt();
            int b[]=new int[m];
            System.out.println("Enter the elements of second array");
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int c[]=new int[n+m];
            int i=0,j=0,k=0;
            while(i<n && j<m)
            {
                if(a[i]<b[j])
                {
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else
                {
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            while(i<n)
            {
                c[k]=a[i];
                i++;
                k++;
            }
            while(j<m)
            {
                c[k]=b[j];
                j++;
                k++;
            }
            System.out.println("The merged array is");
            for(i=0;i<n+m;i++)
            {
                System.out.println(c[i]);
            }
        }
    }
}