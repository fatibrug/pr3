package at.campus02.pr3.old_exams.exam_2021_02_03.ue2;


import java.util.Date;

public class Worker implements Runnable {

    private final int sleepInterval = 1000; //msec = 1 SEK
    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
        System.out.println("ShutDown has been requested.");
    }

    @Override
    public void run() {
        while (isRunning) {
            Date current_date = new Date();
            System.out.println(current_date.toString());
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
