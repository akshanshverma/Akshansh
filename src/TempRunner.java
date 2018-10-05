import java.util.Scanner;

public class TempRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp like:-(26f or 26c)");
		String s = sc.next();
		Util.temperaturConversion(s);
		sc.close();
	}
}
