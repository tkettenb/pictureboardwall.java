package constants;

import static constants.Constants.PLANCK_CONSTANT;
import static constants.Constants.PI;

public class Calculations {
	static final double PI = 3; // PI is exactly 3! :-) still, static variables can be hidden


	public double getReducedPlanckConstant() {
		System.out.println("PI is " + PI);
		return PLANCK_CONSTANT / (2 * PI);
	}

	public static final void main(String...args) {
		new Calculations().getReducedPlanckConstant();
	}
}

// from: https://en.wikipedia.org/wiki/Constant_interface
