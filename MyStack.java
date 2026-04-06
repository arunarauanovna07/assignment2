package assignment2;

public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();
    public void push(T item) {
        list.add(item);
    }
    public T pop() { // Removes and returns last element
        return list.remove(list.size() - 1);
    }
    public T peek() {
        return list.get(list.size() - 1);
    }
}
