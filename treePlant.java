import java.util.*;

class treePlant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int T = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            // find index where T fits in array A
            int index = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= X) {
                    index = i;
                    break;
                }
            }
            index = index - 1;
            // print elements on index
            int i=index;
            int j=index+1;
            int count=0;
            ArrayList <Integer> al=new ArrayList<Integer>();
            while(count<T){
                if(Math.abs(A[i]-X)<=Math.abs(A[j]-X)){
                    al.add(A[i]);
                    count++;
                    i--;
                }
                else{
                    al.add(A[j]);
                    count++;
                    j++;
                }
            }
            //sort the elements in ascending order
            Collections.sort(al);
            //print al
            for(int k=0;k<al.size();k++){
                System.out.print(al.get(k)+" ");
            }
        }
    }
}