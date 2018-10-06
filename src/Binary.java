import java.util.Scanner;

public class Binary {

	public static String swap(String s) {
		String[] ar = new String[s.length() / 4];
		int j = 1, i = 0;
		String st = "";
		while (j <= s.length()) {
			st = st + s.charAt(j - 1);
			if (j % 4 == 0) {
				ar[i++] = st;
				st = "";
			}
			j++;
		}

		for (int k = 0; k < ar.length / 2; k++) {
			String temp = ar[k];
			ar[k] = ar[k + 1];
			ar[k + 1] = temp;
			k++;
		}

		for (int k = 0; k < ar.length; k++) {
			st = st + ar[k];
		}
		System.out.println("swap " + st);
		return st;
	}

	public static void toDecimal(String s) {
		int j = 0;
		int k = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) - 48 == 1) {

				k = k + (int) Math.pow(2, j);
			}
			j++;
		}
		System.out.println(k);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt();
		String s = swap(DecimalToBinary.toBinary(n));
		toDecimal(s);
		sc.close();
	}
}
