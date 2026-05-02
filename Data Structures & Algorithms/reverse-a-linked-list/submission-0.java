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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for(int i = arr.size()-1; i>= 0; i--){
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
