import java.util.Scanner;

public class FirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findPosition(nums, target, true), findPosition(nums, target, false)};
    }

    private static int findPosition(int[] nums, int target, boolean findFirst) {
        int index = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 2};
        System.out.println("Given Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("Enter the target: ");
        int[] ans = searchRange(arr, sc.nextInt());
        System.out.println("First Position of target is at index: "+ans[0]);
        System.out.println("Last position of target is at index: "+ans[1]);
    }
}
