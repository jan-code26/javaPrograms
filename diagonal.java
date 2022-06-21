public class diagonal {
    // Given a square binary matrix of drimensions N×N.
    // Flip the matrix diagonally and return the matrix.
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 1, 0, 1, 0 } };
        // flip diagonally
        int[][] mat2 = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat2[i][j] = mat[j][i];
            }
        }
    }
}