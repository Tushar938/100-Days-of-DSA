import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String longest_word = "";
        String current_word = "";

        for(char c : str.toCharArray()){
            if(c==' ' || c==',' || c=='.' || c=='!' || c=='?'){
                longest_word = (longest_word.length()<current_word.length())?current_word:longest_word;
                current_word = "";
            }else    
                current_word = current_word.concat(Character.toString(c));
        }

        longest_word = (longest_word.length()<current_word.length())?current_word:longest_word;

        System.out.println("Longest word in the given String is: ".concat(longest_word));
    }
}
