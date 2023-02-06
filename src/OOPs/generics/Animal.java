package OOPs.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/6/2023
 * Time: 4:01 PM
 * File Name : Animal.java
 */
public class Animal {
    public void eat() {
        System.out.println("Any animal can eat......");
    }

    public void walk() {
        System.out.println("Any animal can walk....");
    }

}

class Cat extends Animal {


    public void voice() {
        System.out.println("Meow Meow....");
    }
}

class Dog extends Animal {
    public void voice() {
        System.out.println("Bark Bark....");
    }
}
