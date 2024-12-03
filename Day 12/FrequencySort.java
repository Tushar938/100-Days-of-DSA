import java.util.ArrayList;
import java.util.List;

public class FrequencySort{
    public static String frequencySort(String s) {
        int[] freq = new int[128]; 
        for (char c : s.toCharArray())
            freq[c]++;

        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                characters.add((char) i);
        }

        characters.sort((a, b) -> freq[b] - freq[a]);

        StringBuilder result = new StringBuilder();
        for (char c : characters)
            result.append(String.valueOf(c).repeat(freq[c]));

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println("String: ".concat(s));
        System.out.println("Sorted by frequency: " + frequencySort(s));
    }
}
