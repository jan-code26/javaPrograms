import java.util.ArrayList;

public class rotateMat {
    //Rotate the n x n 2D matrix by 90 degrees (clockwise).
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<3;i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0;j<3;j++){
                row.add(i*j);
            }
            mat.add(row);
        }
        System.out.println(mat);
        //rotate the matrix by 90 degrees
        //for loop to iterate through the rows
        for(int i=0;i<mat.size()/2;i++){
            //for loop to iterate through the columns
            for(int j=i;j<mat.size()-i-1;j++){
                //swap the elements
                //at i,j, the element is temp
                int temp = mat.get(i).get(j);
                mat.get(i).set(j,mat.get(mat.size()-j-1).get(i));
                mat.get(mat.size()-j-1).set(i,mat.get(mat.size()-i-1).get(mat.size()-j-1));
                mat.get(mat.size()-i-1).set(mat.size()-j-1,mat.get(j).get(mat.size()-i-1));
                mat.get(j).set(mat.size()-i-1,temp);
            }
        }
        System.out.println(mat);
    }
}
