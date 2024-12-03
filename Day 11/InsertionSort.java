public class InsertionSort {
    public static int[] Sort(int arr[]){
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                int num = arr[i];
                int j = i;
                while(arr[j-1] >= num){
                    arr[j] = arr[j-1];
                    j--;
                    count++;
                }
                arr[j] = num;
            }        
        }
        System.out.println();
        System.out.println();
        System.out.println("Total number of shifts to sort the array: "+count);
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
