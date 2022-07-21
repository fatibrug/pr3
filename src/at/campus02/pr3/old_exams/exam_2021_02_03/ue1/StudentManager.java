package at.campus02.pr3.old_exams.exam_2021_02_03.ue1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }

    public void exportToCsv(String path, String separator) throws StudentExportException {
        File file = new File(path);
        if (file.exists()) {
            throw new StudentExportException("File already exists");
        }
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Student a : getStudents()) {
                bufferedWriter.write(a.getId() + separator + a.getName()
                        + separator + a.getEmail());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("Student with ID " + a.getId() + " has been written to CSV.");
            }
            System.out.println("Writing is finished.");
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
