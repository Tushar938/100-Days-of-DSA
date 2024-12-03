import java.util.*;

public class SlidingWindowMaximum {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int count = sc.nextInt();
        int[] nums = new int[count];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<count; i++)
            nums[i] = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        List<Integer> maxValues = maxSlidingWindow(nums, k);
        System.out.println("Sliding window maximums: " + maxValues);
    }
}
