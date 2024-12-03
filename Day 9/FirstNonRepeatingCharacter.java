import java.util.Scanner;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static void findFirstNonRepeating(String stream) {
        Queue<Character> queue = new Queue<Character>();
        Map<Character, Integer> frequencyMap = new HashMap<>();

        System.out.println("Processing stream: " + stream);

        for (char ch : stream.toCharArray()) {
            // Update frequency map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

            // Add the character to the queue
            queue.offer(ch);

            // Remove characters from the queue if they are no longer non-repeating
            while (!queue.isEmpty() && frequencyMap.get(queue.peek()) > 1) {
                queue.poll();
            }

            // Print the first non-repeating character
            if (queue.isEmpty()) {
                System.out.println("First non-repeating character: None");
            } else {
                System.out.println("First non-repeating character: " + queue.peek());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character stream: ");
        String stream = sc.nextLine();

        findFirstNonRepeating(stream);
    }
}
