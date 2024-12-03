import java.util.Scanner;

public class VowelConsonentCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                count++;
        }
        System.out.println("Number of vowels: "+count);
        System.out.println("Number of consonents: "+(str.length()-count));
    }
}
