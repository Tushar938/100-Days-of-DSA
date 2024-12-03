public class DutchNationalFlag {
    public static int[] Sort(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid < high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1)
                mid++;
            else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                mid++;
                high--;
            }
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 2, 0, 2, 1, 0};
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
