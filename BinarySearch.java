public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,3,4,5};
        int target = 4;

        int binary_search = binarySearch(arr,target);
        if(binary_search != -1){
            System.out.println("your target "+ target+ " is at "+binary_search+" index");
        }
    }
    static int binarySearch(int arr[] , int target){

        int low = 0;
        int high = arr.length-1;
        int mid; 

        while(low <= high){
            mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                high = mid-1;
            }

            if(arr[mid] < target){
                low = mid+1;
            }
        }

        return -1;
    }
}
