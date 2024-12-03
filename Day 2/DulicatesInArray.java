import java.util.*;

public class DulicatesInArray {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.println("Enter elements of the array: ");
        for(int i=0; i<count; i++)
            arr[i] = sc.nextInt();
        
        for(int i=0; i<count; i++){

            int num = 0;

            for(int j=0; j<count; j++){
                if(i==j)
                    continue;
                else if(arr[i] == arr[j])
                    num++;                
            } 
            
            if(num>0 && !ans.contains(arr[i]))
                ans.add(arr[i]);
            
        }

        System.out.println(ans);

    }
}
