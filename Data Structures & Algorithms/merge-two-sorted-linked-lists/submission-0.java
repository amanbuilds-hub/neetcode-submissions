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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = list1;
        while(curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        ListNode curr2 = list2;
        while(curr2 != null){
            arr.add(curr2.val);
            curr2 = curr2.next;
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; 
        for(int i = 0; i< arr.size(); i++){
            tail.next = new ListNode(arr.get(i));
            tail = tail.next;
        }
        return dummy.next;
    }
}