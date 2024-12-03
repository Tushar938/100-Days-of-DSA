import java.util.Arrays;

public class MinSwap{
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arrWithIndex = new int[n][2];

        for (int i = 0; i < n; i++) {
            arrWithIndex[i][0] = nums[i];
            arrWithIndex[i][1] = i;  
        }

        Arrays.sort(arrWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arrWithIndex[i][1] == i)
                continue;

            int cycleSize = 0;
            int x = i;

            while (!visited[x]) {
                visited[x] = true;
                x = arrWithIndex[x][1];
                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        System.out.println("Given Array: ");
        for (int i : nums)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Minimum swaps: " + minSwaps(nums));
    }
}
