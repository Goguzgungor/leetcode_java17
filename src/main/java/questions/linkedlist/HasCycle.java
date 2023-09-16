package questions.linkedlist;

import questions.sumoftwo.ListNode;

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
