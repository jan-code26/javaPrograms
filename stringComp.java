import java.util.*; 
public class stringComp {
    // main method
    public static void main(String[] args) {
        try (// create a Scanner object
        Scanner input = new Scanner(System.in)) {
            // prompt the user to enter two strings
            System.out.print("Enter two strings: ");
            String str1 = input.next();
            String str2 = input.next();
            int step=input.nextInt();
            // call the compare method
            int result = compare(str1, str2,step);
            // if result is 1, the strings are equal
            if (result == 1) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
    //compare method
    public static int compare(String str1, String str2,int step) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                continue;
            }
            else if (str1.charAt(i) < str2.charAt(i)) {
                //if the first character is smaller, subtract first character from the second and compare it to step value
                int result = str2.charAt(i) - str1.charAt(i);
                //print the result
                System.out.println("The result of comparing " + str1.charAt(i) + " and " + str2.charAt(i) + " is " + result);
                if (result > step) {
                    return -1;
                }
            }
            else {
                //if the first character is larger, subtract second character from the first in cyclic and compare it to step value
                int result = 26-str1.charAt(i) + str2.charAt(i);
                System.out.println("The result of comparing " + str1.charAt(i) + " and " + str2.charAt(i) + " is " + result);
                if (result > step) {
                    return -1;
                }
            }
        }
        // return the result
        return 1;
    }
}
