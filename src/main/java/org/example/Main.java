package org.example;


import questions.MergeTwoSortedLists;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(new questions.sumoftwo.ListNode(1, new questions.sumoftwo.ListNode(2, new questions.sumoftwo.ListNode(4))),
                new questions.sumoftwo.ListNode(1, new questions.sumoftwo.ListNode(3, new questions.sumoftwo.ListNode(4))));
    }
}