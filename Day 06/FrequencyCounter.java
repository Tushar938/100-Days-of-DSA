import java.util.Scanner;

public class FrequencyCounter {
    public static void countFrequencies(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        System.out.println("Frequencies:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " -> " + arr[i] / n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the arry: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        countFrequencies(arr);
    }
}
