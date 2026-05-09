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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        left--;
        right--;

        while(left < right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        //Ab mera list Reverse hogya hai, ab usko LL me convert krna hai
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; 
        for(int i = 0; i<list.size(); i++){
            ListNode newNode = new ListNode(list.get(i));
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;

    }
}