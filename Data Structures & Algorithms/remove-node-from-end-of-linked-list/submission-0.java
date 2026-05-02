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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        arr.remove(arr.size()-n);
        ListNode dummy = new ListNode(0);
        curr = dummy;

        for(int var : arr){
            curr.next = new ListNode(var);
            curr = curr.next;
        }
        return dummy.next;
    }
}
