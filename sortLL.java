//sort linked list in java using insertion sort
import java.util.*;
class sortLL
{
    public static void main(String args[])
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements");
            int n=sc.nextInt();
            LinkedList<Integer> l=new LinkedList<>();
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                l.add(sc.nextInt());
            }
            for(int i=1;i<n;i++)
            {
                int key=l.get(i);
                int j=i-1;
                while(j>=0 && l.get(j)>key)
                {
                    l.set(j+1,l.get(j));
                    j--;
                }
                l.set(j+1,key);
            }
            System.out.println("The sorted linked list is");
            for(int i=0;i<n;i++)
            {
                System.out.println(l.get(i));
            }
        }
    }
}