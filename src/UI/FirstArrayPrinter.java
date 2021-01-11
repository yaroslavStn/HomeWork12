package UI;

import UI.ArrayPrinter;

public class FirstArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.print("["+elem+"] ");
        // ui.SoutArrayTypeOne();
    }
}
