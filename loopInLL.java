//check if there is loop in linked list or not using fast and slow pointers
import java.util.*;
public class loopInLL {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements");
            int n=sc.nextInt();
            LinkedList<Integer> l=new LinkedList<>();
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                l.add(sc.nextInt());
            }
            System.out.println("Enter the last element of linked list");
            int last=sc.nextInt();
            int i=0;
            int j=0;
            while(i<n && j<n)
            {
                if(l.get(i)==last)
                {
                    System.out.println("Loop found");
                    break;
                }
                i++;
                j++;
            }
            if(i==n && j==n)
            {
                System.out.println("Loop not found");
            }
        }
    }
}
