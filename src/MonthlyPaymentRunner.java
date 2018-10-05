import java.util.Scanner;

public class MonthlyPaymentRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Principal");
		int p = sc.nextInt();
		System.out.println("enter year");
		int y = sc.nextInt();
		System.out.println("enter percent");
		int r = sc.nextInt();

		System.out.println("per month " + Util.monthlyPayment(p, y, r));
		sc.close();
	}
}
