//reverse LinkedList
import java.util.*;
class reverseLL
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
            LinkedList<Integer> l1=new LinkedList<>();
            while(!l.isEmpty())
            {
                l1.add(l.removeLast());
            }
            System.out.println("The reversed linked list is");
            for(int i=0;i<n;i++)
            {
                System.out.println(l1.get(i));
            }
        }
    }
}