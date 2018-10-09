import java.util.Scanner;

/******************************************************************************
 * Purpose: Binary class which take input number then convert it into binary
 * number which is multiple of 4 then swap the 4 4 pair of binary number and
 * give the decimal number of new binary number.
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/
public class Binary {
	/**
	 * function to swap nibbles
	 * 
	 * @param s String of binary number
	 * @return String type swapped nibbles binary string
	 */
	public static String swap(String s) {
		/*
		 * string will always multiple of 4
		 */

		// String type array to save 4 4 digit of binary number
		String[] ar = new String[s.length() / 4];
		// int j for position of index
		// int i for index value of array
		int j = 1, i = 0;

		// st is empty to hold 4 charter of string
		String st = "";
		while (j <= s.length()) {
			// every time on charter will add in string
			st = st + s.charAt(j - 1);
			// if j is multipal of 4 then it will add string in array and make st again
			// empty
			if (j % 4 == 0) {
				ar[i++] = st;
				st = "";
			}
			j++;
		}

		// swap the value of array to the next value
		for (int k = 0; k < ar.length / 2; k++) {
			String temp = ar[k];
			ar[k] = ar[k + 1];
			ar[k + 1] = temp;
			k++;
		}

		// add the value of array in single string
		for (int k = 0; k < ar.length; k++) {
			st = st + ar[k];
		}
		System.out.println("swap " + st);
		return st;
	}

	/**
	 * function to convert the binary number to decimal number
	 * 
	 * @param s String of binary number
	 */
	public static void toDecimal(String s) {
		int j = 0;
		// k to hold decimal number
		int k = 0;
		// for loop to traverse value from last index of string
		for (int i = s.length() - 1; i >= 0; i--) {
			// to check number is 1 or not
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
