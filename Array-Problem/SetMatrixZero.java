import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

    // BruteForce approach :-
    static ArrayList<ArrayList<Integer>> setMatrixZero (ArrayList<ArrayList<Integer>> matrix, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix.get(i).get(j)==0) {
                    setRow(matrix,n,m,i);
                    setCol(matrix,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix.get(i).get(j)==-1) {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
    static ArrayList<ArrayList<Integer>> setRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i){
        for(int j=0;j<m;j++){
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
        return matrix;
    }
    static ArrayList<ArrayList<Integer>> setCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j){
        for(int i=0;i<n;i++){
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
        return matrix;
    }



    // Better approach :-
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        int[] row=new int[n];
        int[] col=new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                    
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
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
