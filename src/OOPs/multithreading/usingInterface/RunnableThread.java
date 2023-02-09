package OOPs.multithreading.usingInterface;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/9/2023
 * Time: 10:07 PM
 * File Name : RunnableThread.java
 */
public class RunnableThread implements Runnable {
    private int threadNumber;

    RunnableThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
//            if(threadNumber == 2){
//                throw new RuntimeException();
//            }
            System.out.println("thread " + i + " is coming from " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
