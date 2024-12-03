import java.util.Arrays;
import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in arr1: ");
        int count1 = sc.nextInt();
        System.out.print("Enter number of elements in arr2: ");
        int count2 = sc.nextInt();

        int[] arr1 = new int[count1];
        int[] arr2 = new int[count2];
   
        System.out.println("Enter the elements of arr1: ");
        for(int i=0; i<count1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the elements of arr2: ");
        for(int i=0; i<count2; i++)
            arr2[i] = sc.nextInt();

        System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));
        System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
 
        int[] temp = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            temp[index++] = num;
        }

        for (int num : arr2) {
            temp[index++] = num;
        }

        Arrays.sort(temp);

        int[] result = new int[temp.length];
        int resIndex = 0;

        for (int i = 0; i < temp.length; i++) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                result[resIndex++] = temp[i];
            }
        }

        return Arrays.copyOf(result, resIndex);
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (index == 0 || temp[index - 1] != arr1[i]) {
                    temp[index++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        return Arrays.copyOf(temp, index);
    }
}
