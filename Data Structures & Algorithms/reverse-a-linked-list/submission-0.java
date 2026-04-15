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
        if(head==null) return null;

        Stack<ListNode> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        ListNode newHead=st.pop();
        ListNode dummy=newHead;

        while(!st.isEmpty()){
            ListNode node=st.pop();
            dummy.next=node;
            dummy=node;
        }
        dummy.next=null;
        return newHead;
    }
}
