public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if (s == f) {
                return true;
            }
        }
        return false;
    }
}
