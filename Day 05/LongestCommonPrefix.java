import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int count = sc.nextInt();
        String[] arr = new String[count];
        int min_length = Integer.MAX_VALUE;
        String substring1 = "";
        String answer = "";

        System.out.println("Enter the strings: ");
        for(int i=0; i<count; i++){
            arr[i] = sc.next();
            min_length = Math.min(arr[i].length(), min_length);
        } 

        for(int i=0; i<min_length; i++){
            substring1 = arr[0].substring(0, i);
            boolean bool = true;
            for(String j : arr){
                String subString2 = j.substring(0, i);
                if(!substring1.equals(subString2)){
                    bool = false;
                }
            }
            if(bool){
                answer = answer.length()<substring1.length()?substring1:answer;
            }else
                break;
        }

        System.out.println("Longest common prefix: ".concat(answer));
    }    
}
