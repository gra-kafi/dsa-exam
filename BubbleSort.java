public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,5,3,4,5};
        bubbleSort(arr);

        for(int x : arr){
            System.out.print(x+ " ");

        }
    }

    static void bubbleSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
