// Two Sum : Check if a pair with given sum exists in Array


import java.util.Arrays;
import java.util.HashMap;


// BruteForce Approach
public class Two_Sum {
    public static String two_sum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println( i + ", " + j);
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static int[] two_sum_bruteForce(int arr[],int target){
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

//  Better Approach
    public static int[] twoSum(int []arr, int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int moreNeeded=target-arr[i];
            if(map.containsKey(moreNeeded)){
                ans[0] = map.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }

        return ans;
    }


    // Optimal Approach
    public static boolean twoSumOptimal(int []arr, int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left< right) {
            int sum = arr[left]+ arr[right];
            if(sum==target){
                return true;
            }else if(sum< target){
                left++;
            }
            else right--;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        // System.out.println(two_sum(arr,14));
        int[] ans=new int[2];
        ans=twoSum(arr,14);
        // System.out.println(twoSumOptimal(arr, 14));
        System.out.println("[" + ans[0] + ", "+ ans[1] + "]");
    }
}
