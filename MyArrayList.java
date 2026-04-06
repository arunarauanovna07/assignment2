package assignment2;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;
    public MyArrayList() {
        elements = new Object[5];
    }
    private void increaseCapacity() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public void add(T item) {
        if (size >= elements.length) {
            increaseCapacity();
        }
        elements[size] = item;
        size++;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public T remove(int index) {   // Removes element by index
        T removed = (T) elements [index];
        for (int i = index; i < size - 1; i++) {   // shift elements to the left
            elements[i] = elements[i + 1];
        }
        size--;
        return removed;
    }

    public int size() {    // Returns number of elements
        return size;
    }
}