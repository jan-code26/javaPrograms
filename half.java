
//two words, in which he has to break each word into two parts
// First Word- W1+W2
// Second Word - W3+W4 
import java.util.*;

class half {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next();
            String s2 = sc.next();
            for (int i = 0; i < s1.length(); i++) {
                if (Subwords(s1, s2, i)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    // method to return subwords of a string from given index
    public static boolean Subwords(String s1, String s2, int index) {
        String w1 = s1.substring(0, index) + s2.substring(index, s2.length());
        String w2 = s1.substring(index, s1.length()) + s2.substring(0, index);
        System.out.println(w1 + " " + w2);
        // reverse of w1
        String w3 = new StringBuffer(w1).reverse().toString();
        // reverse of w2
        String w4 = new StringBuffer(w2).reverse().toString();

        // check if the words are equal
        if (w1.equals(w3) || w2.equals(w4)) {
            return true;
        } else {
            return false;
        }
    }

}