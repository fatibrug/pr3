package at.campus02.pr3.threads.uebungen.ue3;


public class main {
    public static void main(String[] args) {
        Worker w1 = new Worker();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

       //  System.out.println(w1.counter);
        System.out.println("Fertig!");
    }
}
