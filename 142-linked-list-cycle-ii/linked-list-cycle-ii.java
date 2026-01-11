/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode entry = head;
        if (head == null) return null;
     ListNode s = head;
     ListNode f = head;
     while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
        if(s==f){
         
                while (entry != s) {
                    entry = entry.next;
                    s = s.next;
                }
                return entry; // cycle start
            }
        }
        return null;
    }
}