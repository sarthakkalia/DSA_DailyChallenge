public class SearchElementRotatedSortedArray {
    public static int search(int[] arr, int target){
        int low=0; int high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid] ){ // left half sorted
                if(arr[low]<=target && target <=arr[mid]){ // arr[low]<=target<=arr[mid]
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{  // right half sorted
                if(arr[mid]<=target && target <=arr[high]){ // arr[mid]<=target<=arr[high]
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target= 1;
        int ans = search(arr, target);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
