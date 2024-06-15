import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum_BruteForce(int[] arr, int target) {
        int n=arr.length;
        Set<List<Integer>> set= new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }

    public static List<List<Integer>> fourSum_Better(int[] arr, int target) {
        int n=arr.length;
        Set<List<Integer>> set= new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> hashSet= new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int moreNeeded= target-(arr[i]+arr[j]+arr[k]);
                    if(hashSet.contains(moreNeeded)){
                        // List<Integer> temp= new ArrayList<>();
                        // temp.add(arr[i]);
                        // temp.add(arr[j]);
                        // temp.add(arr[k]);
                        // temp.add(moreNeeded);
                        // temp.sort(null);
                        // set.add(temp);
                        List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k],moreNeeded);
                        temp.sort(null);
                        set.add(temp);
                    }
                    hashSet.add(arr[k]);
                }
            }
        }
        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        // If you not using static then create a object and then call the function.
        // FourSum obj= new FourSum();
        // List<List<Integer>> ans= obj.fourSum(nums,target);

        // If you use static then directly call the function without creating the object.
        List<List<Integer>> ans= fourSum_Better(nums,target);
        System.out.println(ans);

        // System.out.println("The quadruplets are: ");
        // for (List<Integer> it : ans) {
        //     System.out.print("[");
        //     for (int ele : it) {
        //         System.out.print(ele + " ");
        //     }
        //     System.out.print("] ");
        // }
    }
}
