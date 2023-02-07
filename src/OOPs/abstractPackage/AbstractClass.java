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
    //abstract static void run(); //error
    // To Do Something.

    private void go() {

    }

    // final or private abstract void comeHere();  error here.
    final void come() {
        //
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
