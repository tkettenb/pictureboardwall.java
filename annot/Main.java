package annot;

// import annot.ExampleAnnotation;

@ExampleAnnotation("Main")
public final class Main {
  
  @ExampleAnnotation(value = "init", long_description = "Initializes all resources.")
  private void init() {
    System.out.println("Rock and roll...");
  }

  @ExampleAnnotation(value = "DbResourcePool")
  private Integer dbResource;

  public static final void main(String...args) {
    new Main().init();
    // it's just an example, smokey!
  }
}
