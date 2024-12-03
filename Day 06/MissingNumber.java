import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; 
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        System.out.println("Enter elements of the arry: ");
        for(int i=0; i<n-1; i++)
            arr[i] = sc.nextInt();

        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }
}
