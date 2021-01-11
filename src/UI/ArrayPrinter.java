package UI;

import util.Array;

public class ArrayPrinter {

    public void print(Array array) {
        for (int i = 0; i < array.getSize(); i++) {
            printElem(array.getElem(i));
        }
    }

    protected void printElem(int elem) {

    }
}

