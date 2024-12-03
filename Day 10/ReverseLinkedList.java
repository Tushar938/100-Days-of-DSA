import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList Reverse(LinkedList ll){
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i = ll.size()-1; i>=0; i--){
            ans.add((Integer) ll.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println("Linked List: ".concat(ll.toString()));
        LinkedList<Integer> revll = Reverse(ll);
        System.out.println("Reversed Linked List: ".concat(revll.toString()));
    }
}
