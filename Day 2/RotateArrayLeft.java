import java.util.*;

public class RotateArrayLeft {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void rotateArray(int[] arr){
        int num = arr[0];
        for(int i=0; i<arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = num;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value of k(no. of positions): ");
        int k = sc.nextInt();

        if(count==1)
            printArray(arr);
        else{
            while(k>0){
                rotateArray(arr);
                k--;
            }
            printArray(arr);
        }

    }    
}
