
// https://leetcode.com/problems/merge-nodes-in-between-zeros/


package week1;
import DS.ListNode;


public class Merge_Nodes {

    public static void main(String[] args) {

    }

    public static ListNode mergeNodes(ListNode head) {

        ListNode current = head;
        ListNode newList = null;
        ListNode newHead = newList;

        while (current.next != null) {
            int sum = 0;
            while (current.next.val != 0) {
                sum += current.val;
                current = current.next;
            }

            sum += current.val;

            if (newList == null) {
                newList = new ListNode(sum);
                newHead = newList;
            } else {
                newList.next = new ListNode(sum);
                newList = newList.next;
            }
            current = current.next;
        }
        return newHead;
    }

}
