import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Given Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("Enter the target: ");
        int index = binarySearch(arr, sc.nextInt());
        System.out.println();
        System.out.println("Target found at index: "+index);
    }
}
