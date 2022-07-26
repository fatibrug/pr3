package at.campus02.pr3.threads.example3;

public class Person implements Runnable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        // Während dieser Synchronized-Block ausgeführt wird, darf
        // kein anderer, der sich auf das selbe "Sperr-Objekt bezieht",
        // ausgeführt werden.
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                System.out.println(name);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}




