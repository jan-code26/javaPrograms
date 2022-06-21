//find all factors of given no using dp in increasing order

import java.util.ArrayList;
import java.util.Scanner;
public class allFactors {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            ArrayList<Integer> factors = new ArrayList<Integer>();

            for (int i = 1; i*i<n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }
            for(int i=(int)Math.sqrt(n);i>=1;i--){
                if(n%i==0){
                    factors.add(i);
                }
            }
            int[] factorsArray = new int[factors.size()];
            for (int i = 0; i < factors.size(); i++) {
                factorsArray[i] = factors.get(i);
            }
            //sort the array using sort()
            java.util.Arrays.sort(factorsArray);
        }

    }

}
