package OOPs.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 4:26 PM
 * File Name : PrinterNumeric.java
 */
public class PrinterNumeric<T> {
    T thingToPrint;

    PrinterNumeric(T t) {
        this.thingToPrint = t;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
