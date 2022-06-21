/*To strike Ukarine,Russia has created two missiles with X and Y powers. 
Ukraine decided to develop a single missile to defend itself against Russia
missiles. Ukraines  missile can counter these two missiles only if its power is 
divisible by both X and Y. What is the smallest possible power Ukranie's 
missile should have ?

Input format
The first line will have an integer input X = power of first missile
The second line will have an integer input Y = power of second missile

Output format
An integer value of Ukranies missile power

input= 45
35
output = 315
*/

import java.util.Scanner;
 
public class lcm{
   public static void main(String[] args){
      try (Scanner aScanner = new Scanner(System.in)) {
        //      System.out.print("Enter the value of m:");
              int m = aScanner.nextInt();
        //      System.out.print("Enter the value of n:");
              int n = aScanner.nextInt();
              int lcm = (n == m || n == 1) ? m :(m == 1 ? n : 0);
              if (lcm == 0) {
                 int mm = m, nn = n;
                 while (mm != nn) {
                     while (mm < nn) { mm += m; }
                     while (nn < mm) { nn += n; }
                 }  
                 lcm = mm;
              }
              System.out.println(lcm);
    }
   }
}