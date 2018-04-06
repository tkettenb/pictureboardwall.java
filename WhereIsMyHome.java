import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class WhereIsMyHome {
    public static final void main(String...args) {
        // File homePath = new File("~");
        // System.out.println(homePath.getAbsolutePath());
        if (args.length == 0) {
            args = new String[]{"~"};
        }

        for (String arg: args) {
            String homePath = expandPath(arg);
            System.out.println(homePath);
        }
    }

    // from: https://stackoverflow.com/a/11812192/6104519
    // question: https://stackoverflow.com/questions/7163364/how-to-handle-in-file-paths
    public static String expandPath(String path) {
        try {
            String command = "ls -d " + path;
            Process shellExec = Runtime.getRuntime().exec(
                            new String[]{"bash", "-c", command});

            BufferedReader reader = new BufferedReader(
                            new InputStreamReader(shellExec.getInputStream()));
            String expandedPath = reader.readLine();

            // Only return a new value if expansion worked.
            // We're reading from stdin. If there was a problem, it was written
            // to stderr and our result will be null.
            if (expandedPath != null) {
                    path = expandedPath;
            }
        } catch (java.io.IOException ex) {
                // Just consider it unexpandable and return original path.
        }

        return path;
    }

}

