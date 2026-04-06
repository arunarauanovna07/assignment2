package assignment2;

public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        T data;  // stores the value
        Node next;
        Node prev;
        Node(T data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {  // If list is empty, new node becomes head and tail
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {   // Traverse from head to the desired index
            current = current.next;
        }
        return current.data;
    }

    public T remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
        return current.data;
    }

    public int size() {
        return size;
    }
}
