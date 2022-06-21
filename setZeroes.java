import java.util.ArrayList;

public class setZeroes {
    public void setZeroe(ArrayList<ArrayList<Integer>> a) {
        // Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0.
        // Do it in place.
        int m = a.size();
        int n = a.get(0).size();
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a.get(i).get(j) == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    a.get(i).set(j, 0);
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    a.get(i).set(j, 0);
                }
            }
        }
        
    }
}
