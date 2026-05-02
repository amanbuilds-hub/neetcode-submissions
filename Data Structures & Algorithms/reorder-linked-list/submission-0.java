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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        
        while(curr != null){
            
            arr.add(curr.val);
            curr = curr.next;
            
        }
        int len = arr.size();
        int[] array = new int[len];
        
        int left = 0;
        int right = len - 1;
        int idx = 0;
        while(left <= right){
            if (idx < len) {
                array[idx++] = arr.get(left++);
            }
            if (idx < len) {
                array[idx++] = arr.get(right--);
            }
        }
        curr = head;
        idx = 0;
        while (curr != null) {
            curr.val = array[idx++];
            curr = curr.next;
        }

    }
}
