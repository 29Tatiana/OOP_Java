package sem3_hw;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst("A");
        linkedList.addFirst("B");
        linkedList.addFirst("C");
        linkedList.addFirst("D");
        for (String item: linkedList) {
            System.out.println(item);
        }
        System.out.println("Первый элемент списка: " + linkedList.getFirst());
        linkedList.removeFirst();
        System.out.println(linkedList);

    }
}