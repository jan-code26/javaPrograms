//merge two sorted LL into one sorted LL
import java.util.*;
public class mergeLL {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in first linked list");
            int n=sc.nextInt();
            LinkedList<Integer> l1=new LinkedList<>();
            System.out.println("Enter the elements of first linked list");
            for(int i=0;i<n;i++)
            {
                l1.add(sc.nextInt());
            }
            System.out.println("Enter the number of elements in second linked list");
            int m=sc.nextInt();
            LinkedList<Integer> l2=new LinkedList<>();
            System.out.println("Enter the elements of second linked list");
            for(int i=0;i<m;i++)
            {
                l2.add(sc.nextInt());
            }
            LinkedList<Integer> l3=new LinkedList<>();
            int i=0,j=0;
            while(i<n && j<m)
            {
                if(l1.get(i)<l2.get(j))
                {
                    l3.add(l1.get(i));
                    i++;
                }
                else
                {
                    l3.add(l2.get(j));
                    j++;
                }
            }
            while(i<n)
            {
                l3.add(l1.get(i));
                i++;
            }
            while(j<m)
            {
                l3.add(l2.get(j));
                j++;
            }
            System.out.println("The merged linked list is");
            for(i=0;i<n+m;i++)
            {
                System.out.println(l3.get(i));
            }
        }
    }
}
