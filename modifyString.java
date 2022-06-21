/*
You are given with a string S of length N. You have to sort the string S in such a way that when individual characters are converted to their ASCII values, they should follow given rules :

Characters possessing prime ASCII value should come before characters possessing composite ASCII value.
If two characters are having prime ASCII value, character having less ASCII should come before other.
If two characters are having composite ASCII value, character having greater ASCII value should come before other.
*/
import java.io.*;
import java.util.*;
//main class
public class modifyString {
    public static void main(String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //length of string input
        String s = br.readLine();
        char[] ch = s.toCharArray();
        //map for all characters and their ascii values
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < ch.length; i++){
            map.put(ch[i], (int)ch[i]);
        }
        //char array for all prime characters
        char[] prime = new char[ch.length];
        //char array for all composite characters
        char[] comp = new char[ch.length];
        int p = 0, c = 0;
        for(int i = 0; i < ch.length; i++){
            if(isPrime(map.get(ch[i]))){
                prime[p++] = ch[i];
            }
            else{
                comp[c++] = ch[i];
            }
        }
        //sorting prime characters
        Arrays.sort(prime, 0, p);
        //sorting composite characters in reverse order
        Arrays.sort(comp, 0, c);
        //concatenating prime and composite characters
        char[] ans = new char[ch.length];
        for(int i = 0; i < p; i++){
            ans[i] = prime[i];
        }
        for(int i = 0; i < c; i++){
            ans[p+i] = comp[c-i-1];
        }
        //printing the sorted string
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]);
        }


    }
    //method to check if a number is prime or not
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
