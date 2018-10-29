import java.io.InputStream;

public final class GetResourceAsStream {
  public static final void main(String[] args) {
    System.out.println("class.path := " + System.getenv("class.path"));
    for (String arg: args) {
      resolve(arg);
    }
  }

  public static void resolve(String arg) {
    InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(arg);
    System.out.println(arg + " := " + is);
  }
}
