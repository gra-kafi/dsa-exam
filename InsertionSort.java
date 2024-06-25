public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,3,4,5};

        insertionSort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    private static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j] = arr[j+1];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
