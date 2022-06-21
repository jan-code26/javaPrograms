public class plusOne {
    //Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
    public static int[] plusone(int[] A){
        //remove the leading zeros
        int i = 0;
        while (i < A.length && A[i] == 0) {
            i++;
        }
        int[] C = new int[A.length - i];
        int j = 0;
        while (i < A.length) {
            C[j] = A[i];
            i++;
            j++;
        }
        A=C;
        int carry = 1;
        for(i = A.length - 1; i >= 0; i--){
            int sum = A[i] + carry;
            if(sum == 10){
                A[i] = 0;
                carry = 1;
            }
            else{
                A[i] = sum;
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int[] B = new int[A.length + 1];
            B[0] = 1;
            for( i = 0; i < A.length; i++){
                B[i+1] = A[i];
            }
            return B;
        }
        return A;
    }
    public static void main(String[] args){
        int[] A = {0,1,2,3};
        int[] B = plusone(A);
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i]);
        }
    }
}
