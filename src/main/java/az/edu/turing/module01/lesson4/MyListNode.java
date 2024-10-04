package az.edu.turing.module01.lesson4;

public class MyListNode {
    int val;
    MyListNode next;

    MyListNode() {}

    MyListNode(int val) {
        this.val = val;
    }

    MyListNode(int val, MyListNode next) {
        this.val = val;
        this.next = next;
    }
}
