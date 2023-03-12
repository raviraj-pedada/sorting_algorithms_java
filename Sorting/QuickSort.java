public class QuickSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 65, 95, 5, 1, 99, 20, 18};
        QuickSort quickSort = new QuickSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        quickSort.sort(unsortedArray);
    }

    public void sort(int[] arr){
        int len = arr.length;
        quickSort(arr, 0, len-1);

        //displaying the sorted array
       System.out.println("Elements after Sorting");
       for(int m : arr){
        System.out.print(m + " ");
       }

    }

    public void quickSort(int[] arr, int left, int right){

        if(left<right){
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex-1);
            quickSort(arr, pivotIndex+1, right);
        }

    }

    public int partition(int[] arr, int left, int right){
        int pivot = right;
        right = right --;
        while(left<right){
            if(arr[left] <= arr[pivot]){
                left ++;
            }else if( (arr[left] > arr[pivot]) && ( arr[right] > arr[pivot]) ){
                right--;
            }else if((arr[left] > arr[pivot]) && ( arr[right]<arr[pivot])){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }else{
                right--;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[left];
        arr[left] = temp;
        return left;
    }
}
