
import java.util.Scanner;
public class titleToNumber {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String n=sc.next();
            int res=0;
            for(int i=0;i<n.length();i++){
                res+=(n.charAt(i)-'A'+1);
                res*=(int)Math.pow(26,n.length()-i-1);
            }
            System.out.println(res);
        }
    }
    public String convertToTitle(int A) {
        /*1 -> A
2 -> B
3 -> C
...
26 -> Z
27 -> AA
28 -> AB  */
        String res="";
        while(A>0){
            res=(char)((A-1)%26+'A')+res;
            A=(A-1)/26;
        }
        return res;
    }
}
