package questions.linkedlist;

import questions.sumoftwo.ListNode;


//https://leetcode.com/problems/linked-list-cycle/
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode listnode = head;

        while (listnode != null) {
            System.out.println(listnode.val);
            listnode = listnode.next;
        }
        return false;
    }
}
