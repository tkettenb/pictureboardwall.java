import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public final class ReadFile {
    public static void main(String...args)
    throws IOException, URISyntaxException {
        Reader reader = null;
        if ("-".equals(args[0])) {
            reader = new InputStreamReader(System.in);
        } else {
            reader = new FileReader(new File(new URI(args[0])));
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
