import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero2 {
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int colo0=1;
        // iterate every element in matrix and if zero then mark first row and first column zero ;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0, 0);
                    if(j!=0)    matrix.get(0).set(j,0);
                    else colo0=0;
                }
            }
        }

        // Where the first row and column is zero change entire rows and columns to zero except first row and column;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(i).get(j) != 0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (colo0== 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,2,0)));
        matrix.add(new ArrayList<>(Arrays.asList(3,4,5,2)));
        matrix.add(new ArrayList<>(Arrays.asList(1,3,1,5)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
