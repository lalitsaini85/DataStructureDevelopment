package OOPs.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 4:26 PM
 * File Name : Printer.java
 */
public class Printer<T extends Animal> {
    T tName;

    Printer(T tName) {
        this.tName = tName;
    }

    public void eat() {
        tName.eat();
    }
}
