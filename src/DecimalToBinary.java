import java.util.Scanner;

public class DecimalToBinary {
	public static String toBinary(int n) {
		String st = "";
		while (n > 0) {
			int temp = n % 2;
			st = temp + st;
			n = n / 2;
		}
		if ((st.length() % 4) != 0) {
			int temp = st.length() % 4;
			for (int i = 0; i < 4 - temp; i++) {
				st = 0 + st;
			}
		}
		System.out.println(st);
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		toBinary(n);
		sc.close();
	}
}
