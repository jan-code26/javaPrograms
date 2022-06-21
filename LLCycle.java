//return node where cycle bigins in the linked list
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LLCycle {
    public static Node detectCycle(Node head) {
        // Write your code here.
        if(head==null){
            return null;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    //main method
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next.next;
        Node result=detectCycle(head);
        if(result!=null){
            System.out.println(result.data);
        }
        else{
            System.out.println("null");
        }
    }
}
