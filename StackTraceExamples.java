public final class StackTraceExamples {
    static {
        showStackTrace("first come first server -- static block is even before main. (i guess!)");
    }

    private class Inner {
        void foo() {
            showStackTrace("inner member class function... TODO: correct terms used in this descr?");
        }
    }

    public void bar() {
        showStackTrace("public member function");
        new Inner().foo();
    }

    public static void showStackTrace(final String label) {
        System.out.println(String.format(">>> %s", label));
        for (StackTraceElement s : Thread.currentThread().getStackTrace()) {
            System.out.println(s);
        }
        System.out.println("\n\n");
    }

    public static void main(String...args) {
        showStackTrace("from main method.");
        new StackTraceExamples().bar();
    }
}

// losely related to: https://stackoverflow.com/a/442773
// from: https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method

