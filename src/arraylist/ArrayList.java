package arraylist;

public class ArrayList {
    private int count;
    private int[] values;

    public ArrayList() {
        this.values = new int[5];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(int value) {
        increaseArraySize();
        values[count++] = value;
        return true;
    }

    public int get(int index) {
        return values[index];
    }

    public void add(int index, int value) {
        increaseArraySize();
        for(int counter = count; counter > index; counter--){
            values[counter] = values[counter - 1];
        }
        values[index] = value;
        count++;
    }

    private void increaseArraySize(){
        if(count >= values.length){
            int[] newArray = new int[count * 2];
            for(int counter = 0; counter < count; counter++){
                newArray[counter] = values[counter];
            }
            this.values = newArray;
        }
    }
}
