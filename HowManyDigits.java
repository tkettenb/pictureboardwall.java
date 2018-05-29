import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.nio.charset.StandardCharsets;

public final class HowManyDigits {
    static int getDigitsSet(double f) {
        NumberFormat nf = new DecimalFormat();
        String number = nf.format(f);
        System.out.println(" - dbg - checking number: " + f
						+ "  as string: " + number);
        byte[] bytes = number.getBytes(StandardCharsets.UTF_8);

        int digits = 0;
		int paddedZeros = 0;
        for (byte b: bytes) {
            if ('0' < b && b <= '9') {
                if (paddedZeros > 0) {
                   digits += paddedZeros;
                   paddedZeros = 0;
                }
                ++digits;
            } if ('0' == b) {
                ++paddedZeros;
            }
        }
        return digits;
    }

    public static void main(String...args) {
        for (String arg: args) {
            try {
					System.out.println("".format(
											"Argument: '%s'  has  %d digits.",
											arg,
											getDigitsSet(Double.valueOf(arg))));
			} catch (NumberFormatException e) {
					e.printStackTrace();
			}
        }
    }
}
