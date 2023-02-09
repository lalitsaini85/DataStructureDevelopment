package OOPs.multithreading.usingInterface;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/9/2023
 * Time: 10:16 PM
 * File Name : Main.java
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            RunnableThread runnableThread = new RunnableThread(i);
            Thread thread = new Thread(runnableThread);
            thread.start();
            thread.join();
            thread.isAlive();
        }

    }
}
