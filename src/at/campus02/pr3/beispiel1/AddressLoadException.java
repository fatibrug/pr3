package at.campus02.pr3.beispiel1;

import java.io.IOException;

public class AddressLoadException extends Throwable {
    public AddressLoadException(IOException e) {
        e.printStackTrace();
    }
}
