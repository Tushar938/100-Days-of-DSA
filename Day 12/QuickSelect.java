import java.util.Scanner;

public class QuickSelect {
    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);
            if (pivotIndex == k)
                return arr[pivotIndex];
            else if (pivotIndex < k)
                return quickSelect(arr, pivotIndex + 1, high, k);
            else
                return quickSelect(arr, low, pivotIndex - 1, k);
        }
        return -1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println("Given Array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Kth smallest element: " + quickSelect(arr, 0, arr.length - 1, k - 1));
    }
}
