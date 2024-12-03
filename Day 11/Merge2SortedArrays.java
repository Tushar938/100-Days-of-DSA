public class Merge2SortedArrays {
    public static void MergeArray(int[] arr1, int[] arr2){
        int arr[] = new int[arr1.length+arr2.length];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<arr.length; i++){
            if(index1 == arr1.length || index2 == arr2.length){
                if(index1 != arr2.length){
                    arr[i] = arr1[index1];
                    index1++;
                }else{
                    arr[i] = arr2[index2];
                    index2++;
                }
            }
            else if(arr1[index1]<arr2[index2]){
                arr[i] = arr1[index1];
                index1++;
            }else if(arr1[index1] > arr2[index2]){
                arr[i] = arr2[index2];
                index2++;
            }
        }
        System.out.print("Merged Array: ");
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.print("Array 1: ");
        for(int i : arr1)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("Array 2: ");
        for(int i : arr2)
            System.out.print(i+" ");
        System.out.println();
        MergeArray(arr1, arr2);
    }
}
