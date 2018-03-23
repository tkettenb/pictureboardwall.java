public final class NumberCommaSpaceMatcher {
    // private static final String NUMBER_COMMA_SPACE = "[0-9,\\s]+";
    private static final String NUMBER_COMMA_SPACE = "^\\d+([,\\s]+\\d+)*";

    public static final void main(String...args) {
        for (String arg: args) {
            if (arg.matches(NUMBER_COMMA_SPACE)) {
                System.out.println("".format("%s  matches  regex: %s", arg,
                    NUMBER_COMMA_SPACE));
            }
        }
    }
}
