public class TowerOfHanoi {
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        solveHanoi(n - 1, source, auxiliary, destination);
        
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int disks = 3; 
        System.out.println("Steps to solve Tower of Hanoi for " + disks + " disks:");
        solveHanoi(disks, 'A', 'C', 'B'); 
    }
}
