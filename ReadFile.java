import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class ReadFile {
    public static void main(String...args) throws IOException {
        new BufferedReader(new FileReader(args[0])).readLine();
    }
}

/* some test runs:

        ✗ java ReadFile blah
        Exception in thread "main" java.io.FileNotFoundException: blah (No such file or directory)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at java.io.FileReader.<init>(FileReader.java:58)
            at ReadFile.main(ReadFile.java:7)
        ✗ java ReadFile /var/tmp/test.txt
        ✗ java ReadFile file:///var/tmp/test.txt
        Exception in thread "main" java.io.FileNotFoundException: file:/var/tmp/test.txt (No such file or directory)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at java.io.FileReader.<init>(FileReader.java:58)
            at ReadFile.main(ReadFile.java:7)
        ✗ java ReadFile file:/var/tmp/test.txt
        Exception in thread "main" java.io.FileNotFoundException: file:/var/tmp/test.txt (No such file or directory)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at java.io.FileReader.<init>(FileReader.java:58)
            at ReadFile.main(ReadFile.java:7)
*/
