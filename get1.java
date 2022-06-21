import java.util.*;
public class get1 {
    // main method
    public static void main(String[] args) {
        try (// create a Scanner object
        Scanner input = new Scanner(System.in)) {
            //string input
            String str = input.next();
            //call binarytoint method
            int result = binaryToInt(str);
            int count=0;
            while(result!=1){
                //if results is even devide by 2
                if(result%2==0){
                    result=result/2;
                }
                //else add 1
                else{
                    result=result+1;
                }
                count++;
            }
            //print the count
            System.out.println(count);
        }  
    }
    //method to covert binary string to integer
    public static int binaryToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                result += Math.pow(2, str.length() - i - 1);
            }
        }
        return result;
    }
}
