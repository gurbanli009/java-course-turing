package az.edu.turing.module01.lesson3;

public class Main {
    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode<>();

        list.addHead(10);
        list.addHead(20);
        list.addTail(30);
        list.addTail(40);

        System.out.println(list.toString());

        list.removeHead();
        System.out.println("After removing head: " + list.toString());

        list.removeTail();
        System.out.println("After removing tail: " + list.toString());

        list.insert(1, 25);
        System.out.println("After inserting at index 1: " + list.toString());

        list.update(1, 50);
        System.out.println("After updating index 1: " + list.toString());

        list.delete(1);
        System.out.println("After deleting index 1: " + list.toString());

        list.delete((Integer) 10);
        System.out.println("After deleting item 10: " + list.toString());

        Integer[] array = list.toArray();
        System.out.print("Array form: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        list.deleteAll();
        System.out.println("After deleting all: " + list.toString());
    }
}

