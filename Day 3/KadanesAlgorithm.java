import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int count = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[count];
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();

        int maxSum = arr[0], currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum Subarray: " + maxSum);
    }
}