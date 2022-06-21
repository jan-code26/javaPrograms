import java.util.*;
public class encode {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.next();
            //read pos value from user
            int pos = input.nextInt();
            //call encode method
            String result = encodes(str, pos);
            System.out.println(result);
        }
    }
    public static String encodes(String str, int pos) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
                System.out.println(result);
            }
            else if (Character.isDigit(str.charAt(i))) {
                int num = str.charAt(i) - '0';
                String temp = result;
                for (int j = 0; j < num - 1; j++) {
                    result += temp;
                }
                System.out.println(result);
            }
            if (result.length() >= pos) {
                return result.charAt(pos-1) + "";
            }
        }
        return result.charAt(pos-1) + "";
    }
}
