public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 95, 5, 1, 99, 20, 18};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        selectionSort.sort(unsortedArray);
    }

    public void sort(int[] arr){
        //find the array length without using the inbuilt property.
        //arr.length
       int len = findTheLength(arr);
        
       //sorting the unsorted array
       for(int i =0; i<len; i++){
            int minValue = arr[i];
            int minIndex = i;
            for(int j = i; j<len; j++){
                if(arr[j]<minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
       }

       //displaying the sorted array
       System.out.println("Elements after Sorting");
       for(int m : arr){
        System.out.print(m + " ");
       }

    }    
    public int findTheLength(int[] unSortedArray){
        int i = 0;
        for( int num :unSortedArray){
            i++;
        }
        System.out.println("Length of the given Array :"+ i);
        return i;
    }
}
