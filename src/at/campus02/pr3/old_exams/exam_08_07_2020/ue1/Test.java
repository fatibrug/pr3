package at.campus02.pr3.old_exams.exam_08_07_2020.ue1;

import java.util.List;


public class Test {

    public static void main(String... args) {
        try {
            List<Rechnung> rechnungsListe = RechnungsLoader.loadAll("test.txt");
            System.out.println(rechnungsListe);
            for (Rechnung r : rechnungsListe) {
                System.out.println(r.getRechnungsNr());
                System.out.println(r.getPositionen());
            }
        } catch (RechnungsLoaderException e) {
            e.printStackTrace();
        }


    }
}
