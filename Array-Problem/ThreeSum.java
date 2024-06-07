import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    // BruteForce Approach :-
    public static List<List<Integer>> threeSum_BruteForce(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null); 
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }

    // Better Approach :-
    public static List<List<Integer>> threeSum_better(int[] arr){
        Set<List<Integer>> ansSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third = -(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    ansSet.add(temp);
                }
                set.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum_better(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
