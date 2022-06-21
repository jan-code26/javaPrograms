
//fatorial
//find factorial of given no using dp
public class roundtable {
    public static void main(String args[]){    
  int n=200;//It is the number to calculate factorial    
  long res=factorial(n);
        System.out.println(2*res%1000000007);
 }  
    public static long factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1)%1000000007;
    }

}