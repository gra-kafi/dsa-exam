public class test {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,3,4,5};

        int target = 5;
        bubbleSort(arr);
        System.out.println("After sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        int b = binarySearch(arr,target);
        if(b != -1){
            System.out.println("your index at "+b);
        }
    }

    private static int binarySearch(int arr[] , int target){
        int low = 0;
        int high = arr.length-1;

        int mid;

        while(low <= high){
            mid = (high+low)/2;

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

    private static void bubbleSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
