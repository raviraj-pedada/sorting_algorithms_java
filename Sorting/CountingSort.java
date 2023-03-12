public class CountingSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 95, 5, 1, 99, 20, 18};
        CountingSort countingSort = new CountingSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        countingSort.sort(unsortedArray);
    }

    public void sort(int[] arr){
        int len = arr.length;
        
        int maxElement = findMaxElement(arr, len);

        int[] countingArr = new int[maxElement+1];

        for(int i = 0; i<=maxElement; i++){
            countingArr[i] = 0;
        }

        for(int i =0; i< len; i++){
            int value = arr[i];
            countingArr[value] = countingArr[value] +1;
        }

        for(int i = 1 ; i <= maxElement; i++){
            countingArr[i]+= countingArr[i-1];
        }

        int[] finalSortedArr = new int[len];
        for(int i = len -1; i>=0; i--){
            int value = arr[i];
            int index = countingArr[value] - 1;
            countingArr[value] = countingArr[value] - 1;
            finalSortedArr[index] = value;
        }

        System.out.println("Elements After sorting : ");
        for (int m : finalSortedArr){
            System.out.print(m + " ");
        }

    }

    public int findMaxElement(int[] arr,int  len){
        int maxElement = arr[0];
        for(int i = 1; i< len; i++){
            if(arr[i]> maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    
}
