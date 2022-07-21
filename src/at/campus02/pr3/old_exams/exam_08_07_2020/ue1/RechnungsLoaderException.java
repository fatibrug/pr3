package at.campus02.pr3.old_exams.exam_08_07_2020.ue1;

public class RechnungsLoaderException extends Exception {

    private static final long serialVersionUID = 1L;

    public RechnungsLoaderException(Exception e) {
        System.out.println("Invoice ERROR");
        System.out.println(e.getMessage());
    }


}
