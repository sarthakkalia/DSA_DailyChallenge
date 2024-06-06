public class FirstLast_occurance_sortedArray {
    static int first_occurrence(int[] arr, int target){
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
    static int last_occurrence(int[] arr, int target){
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
    static int[] first_last_occurrence(int[] arr, int target) {
        int lb = first_occurrence(arr, target);
        if (lb == arr.length || arr[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, last_occurrence(arr, target)};
    }

    public static void main(String[] args) {
        int[] arr= {3,4,13,13,13,20,40};
        int target=13;
        int[] result = first_last_occurrence(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
