
// https://leetcode.com/problems/merge-nodes-in-between-zeros/
/**
 * Runtime: 14 ms, faster than 57.34% of Java online submissions for Merge Nodes in Between Zeros.
 * Memory Usage: 303.2 MB, less than 48.35% of Java online submissions for Merge Nodes in Between Zeros.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package week1;

public class Merge_Nodes {

    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {

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
