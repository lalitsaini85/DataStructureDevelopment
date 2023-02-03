package OOPs.basic;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/3/2023
 * Time: 12:47 PM
 * File Name : Constructor.java
 */
public class Constructor {
    protected Constructor() {
        System.out.println("This is super class constructor");
    }
}

class Class1 extends Constructor {
    protected Class1() {
        super();
        System.out.println("This is subclass constructor");
    }
}
