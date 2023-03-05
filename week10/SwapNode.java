package week10;
import DS.ListNode;

public class SwapNode {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        l1.val = 1;
        ListNode l2 = new ListNode();
        l2.val = 2;
        ListNode l3 = new ListNode();
        l3.val = 3;
        ListNode l4 = new ListNode();
        l4.val = 4;

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(swapPairs(l1).toString());
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) { // Falls head leer ist, oder nur 1 Element hat.
            return head;
        }
        ListNode first = head;       // Erstes Element
        ListNode second = head.next; // Zweites Element
        ListNode privious = null;    // vorheriges Element 
        ListNode result = second;    // Head of Result

        while (second != null) {

            first.next = second.next;
            second.next = first;
            if (privious != null) {
                privious.next = second;
            }
            privious = first;
            first = privious.next;
            if (first != null) {
                second = first.next;
            } else {
                second = null;
            }

        }

        return result;
    }

    
}
