package OOPs.wildcard;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 5:04 PM
 * File Name : Main.java
 */
public class Main {
    public static void main(String[] args) {
        NumberPrint<Integer> intNumber = new NumberPrint<>(5);
        printSomething(intNumber);
    }

    public static void printSomething(NumberPrint<?> numberPrint) {
        numberPrint.print();
    }
}

class NumberPrint<T extends Number> {
    T t;

    NumberPrint(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }


}

