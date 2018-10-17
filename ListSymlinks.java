import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ListSymlinks {
    public static void list(final String directory) {
        try {
            Files.walk(Paths.get(directory)).filter(Files::isSymbolicLink)
                .forEach(System.out::println);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static final void main(String...args) {
        for (String a: args) {
            list(a);
        }
    }
}
