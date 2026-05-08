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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        int i = 0;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(i < list1.size() || i < list2.size()){

            int x = (i < list1.size()) ? list1.get(i) : 0;
            int y = (i < list2.size()) ? list2.get(i) : 0;

            int sum = x + y + carry;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            i++;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return dummy.next;
        
    }
}
