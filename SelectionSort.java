public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,3,4,5};
        selectionSort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    private static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int min = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
