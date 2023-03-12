public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 95, 5, 1, 99, 20, 18};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        bubbleSort.sort(unsortedArray);
    }

    public void sort(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len; i++){
            for(int j =0; j < len-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
