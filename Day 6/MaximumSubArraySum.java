import java.util.Scanner;

public class MaximumSubArraySum {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the arry: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
