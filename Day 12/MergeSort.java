import java.util.Arrays;

public class MergeSort {
    public static int[] MergeSort(int[] arr){
        
        if(arr.length > 1){
            int mid = arr.length/2;
            int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
            int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

            MergeSort(arr1);
            MergeSort(arr2);

            int i=0;
            int j=0; 
            int k=0;

            while(i<arr1.length && j<arr2.length){
                if(arr1[i] < arr2[j]){
                    arr[k] = arr1[i];
                    i++;
                }else{
                    arr[k] = arr2[j];
                    j++;
                }
                k++;
            }
            while(i<arr1.length){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            while(j < arr2.length){
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 6, 3};
        System.out.println("Array before sorting: ");
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Array after sorting: ");
        arr = MergeSort(arr);
        for(int i : arr)
            System.out.print(i + " ");
    }
}