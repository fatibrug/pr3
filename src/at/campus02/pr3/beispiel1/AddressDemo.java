package at.campus02.pr3.beispiel1;

public class AddressDemo {

    public static void main(String[] args) {
        String filePath = "test.csv";
        String separator = ","; // in case von PIPE -> \\| (needs to be escaped!)
        AddressManager addressManager = new AddressManager();
        Address a1 = new Address("Robert", "Leitner", "0660", "Robert.leitner@outlook.com");
        Address a2 = new Address("Sabine", "Leitner", "0660", "Sabine.leitner@outlook.com");
        Address a3 = new Address("Christopher", "Leitner", "0660", "Christopher.leitner@outlook.com");
        Address a4 = new Address("Horst", "Leitner", "0660", "Horst.leitner@outlook.com");

        addressManager.add(a1);
        addressManager.add(a2);
        addressManager.add(a3);
        addressManager.add(a4);

        try {
            System.out.println("Result from exportToCsv() Method:");
            addressManager.exportToCsv(filePath, separator);
        } catch (AddressExportFileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (AddressExportException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Result from loadFromCSV() Method:");
            System.out.println(addressManager.loadFromCsv(filePath, separator));
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        } catch (AddressLoadException e) {
            e.printStackTrace();
        }
    }
}
