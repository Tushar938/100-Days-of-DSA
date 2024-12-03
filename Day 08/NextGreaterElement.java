import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        boolean bool = false;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the number of elements in the array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the index of the element whose next greatest element you want to find: ");
        int index = sc.nextInt();
        for(int i=arr.length-1; i>index; i--)
            st.push(arr[i]);
        while(!st.isEmpty()){
            if(st.lastElement()>arr[index]){
                System.out.print("Next Greatest Element after "+arr[index]+" is: "+st.lastElement());
                bool = true;
                st.clear();
            }
        }
        if(!bool)
            System.out.println("There exists no greater element after the given element.");
    }
}