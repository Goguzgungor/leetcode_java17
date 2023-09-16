package questions.linkedlist;

import questions.sumoftwo.ListNode;




//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode listnode = head;
        int count = 1;
        while(listnode.next != null){
            count ++;
            listnode = listnode.next;
        }
        listnode = head;
        for(int i=0; i<(count/2);i++){
            listnode = listnode.next;
        }
        return listnode;
    }
}
