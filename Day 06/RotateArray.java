import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<length; i++){
            if(i<=k)
                arr[i+k] = sc.nextInt();
            else
                arr[i-k-1] = sc.nextInt();
        }

        System.out.println("Array after rotation: ");
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
