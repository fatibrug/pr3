package at.campus02.pr3.threads.uebungen.ue4;

public class Worker implements Runnable {
    private final int sleepInterval = 100; //mse
    public int counter = 0;
    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (counter < 20) {
                lock.notify();
                counter++;
                System.out.println(Thread.currentThread().getName() +
                        " Counter   ---   " + counter);
                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notify();
            }
        }
    }
}
