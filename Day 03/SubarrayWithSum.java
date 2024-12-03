import java.util.Scanner;

public class SubarrayWithSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int count = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[count];
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) sum -= arr[start++];

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with the given sum found.");
    }
}