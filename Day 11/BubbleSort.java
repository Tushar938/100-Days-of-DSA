public class BubbleSort{
    public static int[] Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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