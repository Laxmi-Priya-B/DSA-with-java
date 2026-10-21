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
        if(head.next == null){
            return null;
        }
        ListNode root = head;
        ListNode temp = head;
        int i=1;
        while(i<=n){
            root = root.next;
            i++;
        }
        if(root == null){
            return head.next;
        }
        while(root.next!=null){
            root =root.next;
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }
        return head;
    }
}