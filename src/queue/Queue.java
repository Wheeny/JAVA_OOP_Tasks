package queue;

public class Queue {

    private int head;
    private int count;
    private int[] values = new int[5];

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int value) {
//        values[count] = value;
//        count++;
        values[count++] = value;
    }

    public int remove() {
//        int num = values[head];
//        head++;
//        return  num;
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty!");
        count--;
        return values[head++];
    }

    public int peek() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty!");
        return values[head];

    }
}
