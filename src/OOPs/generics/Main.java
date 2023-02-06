package OOPs.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 4:07 PM
 * File Name : Main.java
 */
public class Main {
    public static void main(String[] args) {
        PrinterNumeric<Integer> printerNumeric = new PrinterNumeric<>(45);
        printerNumeric.print();
        PrinterNumeric<Double> doublePrinter = new PrinterNumeric<>(520.00);
        doublePrinter.print();
        Printer<Animal> t = new Printer<>(new Cat());
        t.eat();

    }
}
