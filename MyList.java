package assignment2;

public interface MyList<T> {
    void add(T item);
    T get(int index);
    T remove(int index);
    int size();
}

