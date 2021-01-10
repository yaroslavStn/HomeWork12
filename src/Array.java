import java.util.Arrays;

public class Array {
    private int[] array = new int[0];
    private int size;
    private int max;

    public Array(int size, int max) {
        this.size = size;
        this.max = max;
    }

    public int[] randomArray() {
        array=Arrays.copyOf(array,size);
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    public int getElem(int index) {
        return array[index];
    }
    public int getSize (){
        return array.length;
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}




