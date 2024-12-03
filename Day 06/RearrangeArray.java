import java.util.Scanner;

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int maxIdx = n - 1, minIdx = 0;
        int maxElement = arr[n - 1] + 1; 

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx--] % maxElement) * maxElement;
            } else {
                arr[i] += (arr[minIdx++] % maxElement) * maxElement;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the arry: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        rearrange(arr);
        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
