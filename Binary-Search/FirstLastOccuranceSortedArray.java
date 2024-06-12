public class FirstLastOccuranceSortedArray {
    public static int firstOccurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if (arr[mid]>target) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }
    public static int lastOccurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if (arr[mid]>target) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }

    public static int[] firstlastOccurance(int[] arr, int target){
        int first=firstOccurance(arr, target);
        int last=lastOccurance(arr, target);
        
        return new int[] {first,last};
    }
    public static int count(int[] arr, int target){
        int [] ans= firstlastOccurance(arr,target);
        if(ans[0]==-1 ) return 0;
        return (ans[1]-ans[0])+1;
    }
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println(count(arr, 8));
    }
}
