package az.edu.turing.module01.lesson4;

public class Solution {
    public MyListNode mergeTwoLists(MyListNode list1, MyListNode list2) {
        MyListNode temp = new MyListNode(-1);
        MyListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return temp.next;
    }
}