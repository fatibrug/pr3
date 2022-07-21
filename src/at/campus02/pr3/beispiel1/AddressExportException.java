package at.campus02.pr3.beispiel1;

import java.io.IOException;

public class AddressExportException extends Throwable {
    public AddressExportException(IOException e) {
        e.printStackTrace();
    }
}
