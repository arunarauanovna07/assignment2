package assignment2;

public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();
    public void add(T value) {
        heap.add(value);
    }
    public T getMin() {
        T min = heap.get(0);
        for (int i = 1; i < heap.size(); i++) {
            if (heap.get(i).compareTo(min) < 0) {
                min = heap.get(i);
            }
        }
        return min;
    }
}
