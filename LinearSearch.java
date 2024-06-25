class LinearSearch{
    public static void main(String[] args) {
        int arr[] = new int []{2,1,3,4,5,6,7,7,6,3};
        int target = 7;

        int linear_search = linearSearch(arr,target);

        if(linear_search != -1){
            System.out.println("your target "+ target+ "is in "+ linear_search);
        }
    }
    static int linearSearch(int arr[] , int target){

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
}