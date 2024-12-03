import java.util.*;

public class SecoundLargestElement{
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        int ans = 0;
        int max = 0;

        System.out.println("Enter elements of the array:");
        for(int i=0; i<count; i++){
            arr[i] = sc.nextInt();
            if(i==0){
                ans = arr[i];
                max = arr[i];
            }
            if(arr[i]>max){
                ans = max;
                max = arr[i];
            }
            else if(arr[i]>ans)
                ans = arr[i];
        }

        sc.close();

        System.out.println("Secound Largest element is: ".concat(Integer.toString(ans)));

    }
}
