

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayPrinter arrayPrinter= new ArrayPrinter();
        for (; ; ) {
            System.out.println("--------Menu--------\n" +
                    "1- print array like'[elem]';\n" +
                    "2- print array like 'i=elem';\n" +
                    "3 - transposed  array; \n" +
                    "4 - exit.\n" +
                    "\n" +
                    "Enter your choice:");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) arrayPrinter = new FirstArrayPrinter();
            else if (ch == 2) arrayPrinter= new SecondArrayPrinter();
            else if (ch == 3) arrayPrinter= new transposedArrayPrinter();
            else if (ch == 4) break;
            else {
                System.out.println("Enter only 1,2 or 3\n");
                continue;
            }
            //System.out.println(array.toString());
            for (int i = 0; i < 3; i++) {
                int size = (int)(Math.random()*10+10);
                int max = (int)(Math.random()*100);
                System.out.print("Array ");
                System.out.println(i+1+"- size: "+size+", range: [0;"+ max +"]:");
                Array array = new Array(size,max);
                array.randomArray();
                arrayPrinter.print(array);
                System.out.println();
            }
            System.out.println();
        }
    }
}
