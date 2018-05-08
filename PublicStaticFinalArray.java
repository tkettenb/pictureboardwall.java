public final class PublicStaticFinalArray {
    public static final String[] defaults = {
        "connection_timeout=60",
        "tcp_port=8080"
    };

    static void printDefaults() {
        int pos = 1;
        for (String var: defaults) {
            System.out.println("".format("%5d  %s", pos++, var));
        }
    }

    public static void main(String...args) {
        if (args.length > 0) {
            String[] copy = new String[args.length];
            int pos = 0;
            for (String arg: args) {
                copy[pos] = arg;
                defaults[pos] = arg;
                ++pos;
            }
            // error: cannot assign a value to final variable defaults
            // PublicStaticFinalArray.defaults = copy;
        }
        printDefaults();
    }
}
