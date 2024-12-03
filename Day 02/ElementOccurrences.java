import java.util.*;

public class ElementOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();

        System.out.println("Which element's occurrence do you want to find out?");
        int num = sc.nextInt();

        int ans = 0;

        for(int i=0; i<count; i++)
            ans = (arr[i]==num)?ans+1:ans;

        System.out.println("Element "+num+" has "+ans+" occurrences.");

    }   
}
