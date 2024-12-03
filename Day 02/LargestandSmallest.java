import java.util.*;

public class LargestandSmallest{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        int min = 0;
        int max = 0;

        System.out.println("Enter elements of the array:");
        for(int i=0; i<count; i++){
            arr[i] = sc.nextInt();
            if(i==0){
                min = arr[i];
                max = arr[i];
            }
            if(arr[i]>max)
                max = arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }

        sc.close();

        System.out.println("Largest element is: ".concat(Integer.toString(max)));
        System.out.println("Smallest element is: ".concat(Integer.toString(min)));

    }
}
