package at.campus02.pr3.old_exams.exam_2021_02_03.ue1;

public class Demo {

    public static void main(String[] args) {
        String path = "test.csv";
        String seperator = ";";
        Student student1 = new Student("1", "Sascha", "sascha.leitner@gmx.at");
        Student student2 = new Student("2", "Robert", "robert.leitner@gmx.at");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);

        try {
            studentManager.exportToCsv(path, seperator);
        } catch (StudentExportException e) {
            e.printStackTrace();
        }
    }

}
