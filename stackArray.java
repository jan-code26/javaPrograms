
// { Driver Code Starts
import java.util.*;

class TwoStack {

    int size;
    int top1, top2;
    // int arr[] = new int[size];
    int arr[] = new int[100];

    TwoStack() {
        int n = 100;
        size = n;
        // arr[] = new int[n];
        top1 = -1;
        top2 = size;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases");
            int T = sc.nextInt();
            while (T > 0) {
                TwoStack sq = new TwoStack();
                System.out.println("Enter the number of queries");
                int Q = sc.nextInt();
                while (Q > 0) {
                    ;
                    System.out.println("stackno");
                    int stack_no = sc.nextInt();
                    System.out.println("Enter the query");
                    int QueryType = sc.nextInt();

                    Stacks g = new Stacks();

                    if (QueryType == 1) {
                        System.out.println("Enter the element to be pushed");
                        int a = sc.nextInt();
                        if (stack_no == 1)
                            g.push1(a, sq);
                        else if (stack_no == 2)
                            g.push2(a, sq);
                    } else if (QueryType == 2) {
                        if (stack_no == 1)
                            System.out.print(g.pop1(sq) + " ");
                        else if (stack_no == 2)
                            System.out.print(g.pop2(sq) + " ");
                    }

                    Q--;
                }
                System.out.println();
                T--;
            }
        }
    }
}

class Stacks {
    // Function to push an integer into the stack1.
    void push1(int x, TwoStack sq) {
        // check if stack1 is full
        if (sq.top1 < sq.top2 - 1) {
            sq.top1++;
            sq.arr[sq.top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x, TwoStack sq) {
        if (sq.top2 > sq.top1 + 1) {
            sq.top2--;
            sq.arr[sq.top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from top of the stack1.
    int pop1(TwoStack sq) {
        if (sq.top1 == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = sq.arr[sq.top1];
            sq.top1--;
            return x;
        }
    }

    // Function to remove an element from top of the stack2.
    int pop2(TwoStack sq) {
        if (sq.top2 == sq.size) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = sq.arr[sq.top2];
            sq.top2++;
            return x;
        }
    }
}
