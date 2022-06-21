import java.util.*;

public class countbit2 {
    // Brian Kernighan’s Algorithm
    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    // main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count=0;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int i=n;i<=m;i++){
                int temp=countBits(i);
                //check if temp is in hashmap or is prime
                if(hm.containsKey(temp) && hm.get(temp)==1){
                    count++;
                }
                else if(isPrime(i)){
                    hm.put(temp, 1);
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isPrime(int temp) {
        for(int i=2;i<=temp/2;i++){
            if(temp%i==0){
                return false;
            }
        }
        return false;
    }
}
