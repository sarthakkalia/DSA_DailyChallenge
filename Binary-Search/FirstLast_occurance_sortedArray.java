public class FirstLast_occurance_sortedArray {
    static int first_occurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int mid;
        int ans=arr.length;
        while (low<=high) {
            mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int last_occurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int mid;
        int ans=arr.length;
        while (low<=high) {
            mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans-1;
    }

    public static void main(String[] args) {
        int[] arr= {3,4,13,13,13,20,40};
        int target=13;
        System.out.println("First Occurance: "+first_occurance(arr, target));
        System.out.println("Last Occurance: "+last_occurance(arr, target));
    }
}
