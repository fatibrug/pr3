package at.campus02.pr3.beispiel2;

public class WorkerDemo {

    public static void main(String[] args) {

        TimePrintWorker timePrintWorker = new TimePrintWorker("TimePrintWorker");
        FileReadWorker fileReadWorker = new FileReadWorker("FileReadWorker",
                "test.txt");
        Thread thread1 = new Thread(timePrintWorker);
        Thread thread2 = new Thread(fileReadWorker);

        thread1.start();
        thread2.start();


        try {
            thread2.join();
            timePrintWorker.stopWorker();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fertig mit allen Arbeiten!");
    }
}
