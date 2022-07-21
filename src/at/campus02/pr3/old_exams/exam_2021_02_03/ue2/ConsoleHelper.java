package at.campus02.pr3.old_exams.exam_2021_02_03.ue2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static String readLine() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            return br.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}