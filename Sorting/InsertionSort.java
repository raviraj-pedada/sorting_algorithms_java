public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 95, 5, 1, 99, 20, 18};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        insertionSort.sort(unsortedArray);
    }

    public void sort(int[] arr){
        //finding the length of the array
        int len = arr.length;

        //sorting the array using the insertion Sort
        for(int i =1; i<len; i++){
            for(int j = i-1; j>=0;j--){
                if(arr[j]<arr[j+1]){
                    break;
                }else{
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                } 
            }
        }

        //displaying the sorted array
       System.out.println("Elements after Sorting");
       for(int m : arr){
        System.out.print(m + " ");
       }
    }
    
}
