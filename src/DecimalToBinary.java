import java.util.Scanner;

/******************************************************************************
 * Purpose: DecimalToBinary class convert decimal value to binary value and make
 * it multiple of 4
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/
public class DecimalToBinary {
	/**
	 * function toBinary is use to convert decimal value to binary value
	 * 
	 * @param n int take decimal value
	 * @return String of binary number
	 */
	public static String toBinary(int n) {
		String st = "";
		/*
		 * Convert to binary and add into string
		 */
		while (n > 0) {
			int temp = n % 2;
			st = temp + st;
			n = n / 2;
		}
		/*
		 * make binary number length in multiple of 4
		 */
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
