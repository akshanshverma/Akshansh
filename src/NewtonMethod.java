
public class NewtonMethod {
	public static void sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t) + t) / 2;
		}

		System.out.println(t);
	}

	public static void main(String[] args) {
		sqrt(3);
	}

}
