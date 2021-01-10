
public class ArrayPrinter {

    public void print(Array array) {
        for (int i = 0; i < array.getSize(); i++) {
            printElem(array.getElem(i));
        }
    }

    protected void printElem(int elem) {

    }
}

class transposedArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.println(elem+" \t");
    }
}

class FirstArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.print("["+elem+"] ");
        // ui.SoutArrayTypeOne();
    }
}

class SecondArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.print("i="+elem+" ");
        //ui.SoutArrayTypeTwo();
    }
}