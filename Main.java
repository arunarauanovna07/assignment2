package assignment2;
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> cities = new MyArrayList<>();
        cities.add("Astana");
        cities.add("Almaty");
        cities.add("Shymkent");
        System.out.println(cities.get(1)); // Almaty
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1
    }
}
