public class SelectionSort {
    public static int[] Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 9, 4};
        System.out.println("Array before Sorting: ");
        for(int i : arr)
            System.out.print(i+" ");
        arr = Sort(arr);
        System.out.println();
        System.out.println("Array after sorting: ");
        for(int i: arr)
            System.out.print(i+" ");
    }
}
