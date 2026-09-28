package stack;

public class MyStack {

    private int[] stackList = new int[5];
    private int count;

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int number) {
        stackList[count++] = number;
    }

    public void pop() {
        count--;
    }

    public int peek() {
        return stackList[--count];
    }

    public int search(int number) {
        for (int index = 0; index < stackList.length; index++){
            if(stackList[index] == number){
                return index+1;

            }
        }
        return -1;
    }
}
