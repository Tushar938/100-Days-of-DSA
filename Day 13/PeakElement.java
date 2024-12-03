import java.util.Scanner;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5};
        System.out.println("Given Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("Peak Element is: "+arr[findPeakElement(arr)]);
    }
}
