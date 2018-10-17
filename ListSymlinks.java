import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ListSymlinks {
    public static void list(final String directory) throws IOException {
        Files.walk(Paths.get(directory)).filter(Files::isSymbolicLink)
            .forEach(System.out::println);
    }

    public static final void main(String...args) throws IOException {
        for (String a: args) {
            list(a);
        }
    }
}
