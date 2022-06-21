//using backtracking find minimum distance btw sourse and destination in a matrix
// Language: java
// Path: shortestpath.java
import java.util.*;
public class shortestpath{
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int r=sc.nextInt();
            int c=sc.nextInt();
            int mat[][]=new int[r][c];
            for(int i=0;i<r;i++) {
                for(int j=0;j<c;j++) {
                    mat[i][j]=sc.nextInt();
                }
            }
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            int d1=sc.nextInt();
            int d2=sc.nextInt();
            //call the function
            int ans=find(mat,s1,s2,d1,d2);
            System.out.println(ans);
        }
    }
    public static int find(int mat[][],int s1,int s2,int d1,int d2) {
        //invalid
        if(s1<0||s1>=mat.length||s2<0||s2>=mat[0].length||d1<0||d1>=mat.length||d2<0||d2>=mat[0].length) {
            return -1;
        }
        int r=mat.length;
        int c=mat[0].length;
        int min_dist=Integer.MAX_VALUE;
        //empty matrix boolean
        boolean[][] visited=new boolean[r][c];
        min_dist=find_min(mat,s1,s2,d1,d2,visited,min_dist,0);
        return min_dist;
    }
    public static int find_min(int[][] mat, int s1, int s2, int d1, int d2, boolean[][] visited, int min_dist, int dist) {
        //if destination is reached return min distance
        if(s1==d1&&s2==d2) {
            return Math.min(dist,min_dist);
        }
        //if destination is not reached
        //mark the current cell as visited
        visited[s1][s2]=true;
        //check for all the possible directions
        //up
        if(s1-1>=0&&!visited[s1-1][s2]&&mat[s1-1][s2]==1) {
            min_dist=find_min(mat,s1-1,s2,d1,d2,visited,min_dist,dist+mat[s1-1][s2]);
        }
        //down
        if(s1+1<mat.length&&!visited[s1+1][s2]&&mat[s1+1][s2]==1) {
            min_dist=find_min(mat,s1+1,s2,d1,d2,visited,min_dist,dist+mat[s1+1][s2]);
        }
        //right
        if(s2+1<mat[0].length&&!visited[s1][s2+1]&&mat[s1][s2+1]==1) {
            min_dist=find_min(mat,s1,s2+1,d1,d2,visited,min_dist,dist+mat[s1][s2+1]);
        }
        //left
        if(s2-1>=0&&!visited[s1][s2-1]&&mat[s1][s2-1]==1) {
            min_dist=find_min(mat,s1,s2-1,d1,d2,visited,min_dist,dist+mat[s1][s2-1]);
        }
        //unmark the current cell
        visited[s1][s2]=false;
        return min_dist;
    }
}