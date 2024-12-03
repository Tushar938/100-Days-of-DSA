import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in arr1: ");
        int count1 = sc.nextInt();
        System.out.print("Enter number of elements in arr2: ");
        int count2 = sc.nextInt();

        int[] arr1 = new int[count1];
        int[] arr2 = new int[count2];

        System.out.println("Enter elements of arr1: ");
        for(int i=0; i<count1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter elements of arr2: ");
        for(int i=0; i<count2; i++)
            arr2[i] = sc.nextInt();

        int[] ans = new int[count1+count2];
        int len=0;
        int i=0, j=0;

        while(i<count1 || j<count2){
            if(i==count1){
                ans[len] = arr2[j];
                j++;
                len++;
            }else if(j==count2){
                ans[len] = arr1[i];
                i++;
                len++;
            }else if(arr1[i]<arr2[j]){
                ans[len] = arr1[i];
                i++;
                len++;
            }else{
                ans[len] = arr2[j];
                j++;
                len++;
            }
        }

        for(i=0; i<count1+count2; i++)
            System.out.print(ans[i]+" ");

    }
}
