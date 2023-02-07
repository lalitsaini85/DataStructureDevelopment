package OOPs.abstractPackage;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/7/2023
 * Time: 12:29 PM
 * File Name : AbstractClass.java
 */
public abstract class AbstractClass {
    int value;

    AbstractClass(int value) {
        this.value = value;
    }

    public abstract void doSomething();

    void start() {
        System.out.println("Starting");
    }
}

class class1 extends AbstractClass {
    class1(int value) {
        super(value);
    }

    public void doSomething() {
        super.value = 20;
        super.start();
    }
}
