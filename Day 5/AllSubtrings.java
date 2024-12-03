import java.util.Scanner;

public class AllSubtrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String substr = str.substring(i, j+1);
                System.out.print(substr.concat(" "));
            }
        }
    }
}
