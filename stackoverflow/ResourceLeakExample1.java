package stackoverflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ResourceLeakExample1 {
  public static void main(String[] args) throws IOException {
    new ResourceLeakExample1().method();
  }

  void method() throws IOException {
    // BufferedReader br=new BufferedReader();
    // BufferedReader br=new BufferedReader(null);  // me stupid: of course, there is a NPE here. do'oh!
    // BufferedReader br=new BufferedReader(new StringReader("blah blub wtf?"));
    // BufferedReader br=new BufferedReader(new StringReader(new byte[]{0}));
    BufferedReader br=new BufferedReader(new StringReader(new String(new char[]{0})));
    String str = br.readLine();
    br.close();
  }

  void method_fixed() throws IOException {
    // using try-with-resources:
    try (BufferedReader br=new BufferedReader(new StringReader(new String(new char[]{0})))) {
      String str = br.readLine();
    }
  }
}
