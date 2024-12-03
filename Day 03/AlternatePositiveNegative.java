import java.util.Scanner;

public class AlternatePositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int count = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[count];
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();

        rearrangeAlternate(arr);

        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeAlternate(int[] arr) {
        int n = arr.length;

        int[] positives = new int[n];
        int[] negatives = new int[n];
        int posIndex = 0, negIndex = 0;

        for (int num : arr) {
            if (num >= 0) {
                positives[posIndex++] = num;
            } else {
                negatives[negIndex++] = num;
            }
        }

        int i = 0, p = 0, q = 0;
        while (p < posIndex && q < negIndex) {
            arr[i++] = positives[p++];
            arr[i++] = negatives[q++];
        }

        while (p < posIndex) {
            arr[i++] = positives[p++];
        }

        while (q < negIndex) {
            arr[i++] = negatives[q++];
        }
    }
}
