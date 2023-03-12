public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 8, 19, 50, 60, 54, 65, 95, 5, 1, 99, 20, 18};
        MergeSort mergeSort = new MergeSort();
        System.out.println("Elements before Sorting");
        for(int m : unsortedArray){
            System.out.print(m + " ");
        }
        System.out.println();
        mergeSort.sort(unsortedArray);
    }
    public void sort(int[] arr){
        int len = arr.length;
        mergeSort(arr,0,len-1);

        //displaying the sorted array
       System.out.println("Elements after Sorting");
       for(int m : arr){
        System.out.print(m + " ");
       }

    }

    public void mergeSort(int[] arr, int left, int right){
        if(left<right){
            
            int middle = (left+right)/2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left,middle,right);
        }
    }

    public void merge(int[] arr, int left, int middle, int right){
        int len1 = middle - left + 1;
        int len2 = right - middle;

        int[] tempArr1 = new int[len1];
        int[] tempArr2 = new int[len2];

        for(int i = 0; i<len1; i++){
            tempArr1[i]= arr[left+i];
        }

        for(int j = 0; j < len2; j++){
            tempArr2[j]= arr[middle+1+j];
        }

        int k = left;
        int i = 0;
        int j = 0;

        while(i<len1 && j<len2){
            if( tempArr1[i] <= tempArr2[j] ){
                arr[k]= tempArr1[i];
                k++;
                i++;
            }else{
                arr[k] = tempArr2[j];
                k++;
                j++; 
            }
        }

        while(i < len1){
            arr[k]= tempArr1[i];
            i++;
            k++;
        }

        while(j < len2){
            arr[k] = tempArr2[j];
            k++;
            j++;
        }
    }
}
