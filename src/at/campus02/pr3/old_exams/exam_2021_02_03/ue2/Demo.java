package at.campus02.pr3.old_exams.exam_2021_02_03.ue2;


public class Demo {

    public static void main(String[] args) {

        Worker w1 = new Worker();
        Thread t1 = new Thread(w1);
        t1.start();

        System.out.println("Drücken Sie eine Taste bzw. Eingabe um zu stoppen ...");
        if (ConsoleHelper.readLine() != null) {
            w1.requestShutDown();
        }

        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fertig!");
    }
}
