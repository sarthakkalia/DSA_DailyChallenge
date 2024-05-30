// Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.

public class Search_Insert_Problem{
    static int insert(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;

    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int x = 6;
        System.out.println(insert(arr, x));
    }
}
