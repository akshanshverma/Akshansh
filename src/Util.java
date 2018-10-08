import java.util.ArrayList;

/******************************************************************************
 * Purpose: Helper class containing static method.
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 06-08-2018
 *
 ******************************************************************************/
public class Util {
	/**
	 * Function to check two string are anagram or not
	 * 
	 * @param a string value of 1st string
	 * @param b string value of 2nd string
	 * @return true or false if both stings are anagram then true otherwise false
	 */
	public static boolean anagram(String a, String b) {
		/*
		 * Anagram is possible only when the size of string is same so if both string
		 * full fill the condition of if then it will enter inside the if otherwise
		 * return false
		 */
		if (a.length() == b.length()) {

			char[] ar = a.toCharArray();
			char[] br = b.toCharArray();
			ArrayList<Character> al = new ArrayList<Character>();
			ArrayList<Character> bl = new ArrayList<Character>();
			/*
			 * for loop to store the value of char array to Character type ArrayList al 1st
			 * ArrayList bl 2nd ArrayList
			 */
			for (char c : ar) {
				al.add(c);
			}
			for (char ch : br) {
				bl.add(ch);
			}
			/*
			 * forEach loop to retrieve the value of bl ArrayList one by one and if
			 * condition to check that al contain value of bl which store in character if al
			 * contain then remove method will remove it for al
			 */
			for (Character character : bl) {
				if (al.contains(character)) {
					al.remove(character);
				}
			}
			/*
			 * after forEach loop if size of al is 0 then all character of both string are
			 * same
			 */
			if (al.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Function is use to print integer anagram of prime number
	 * 
	 * @param alMain ArrayList type input it take prime number list
	 * 
	 *               then print all prime number which are anagram
	 */
	public static void anagramInt(ArrayList<Integer> alMain) {
		/*
		 * al1 ArrayList to store the value of number as single single digit al2
		 * ArrayList to store the value of other number as single single digit
		 * 
		 * temp1 store single digit of number and save it in the ArrayList al1 temp2
		 * store single digit of other number and save it in other ArrayList al2
		 */
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		int temp1, temp2;
		/*
		 * two for loop one for hold one value other is for retrieve all next value to
		 * compare the hold value
		 */
		for (int i = 0; i < alMain.size() - 1; i++) {
			/*
			 * n1 hold the number alMain ArrayList while loop store digit or number in
			 * ArrayList al1 one by one
			 */
			int n1 = alMain.get(i);
			while (n1 > 0) {
				temp1 = n1 % 10;
				al1.add(temp1);
				n1 = n1 / 10;
			}
			for (int j = i + 1; j < alMain.size(); j++) {
				/*
				 * n2 retrieve next value for compare and store in al2 ArrayList
				 */
				int n2 = alMain.get(j);
				while (n2 > 0) {
					temp2 = n2 % 10;
					al2.add(temp2);
					n2 = n2 / 10;
				}
				/*
				 * forEach loop to retrieve the value of al1 ArrayList one by one and if
				 * condition to check that al2 contain value of al1 which store in character if
				 * al2 contain then remove method will remove it for al2
				 */
				for (Integer it : al1) {
					if (al2.contains(it)) {
						al2.remove(it);
					}
				}
				if (al2.isEmpty()) {
					System.out.println(alMain.get(i) + " " + alMain.get(j));
				}
				/*
				 * removeAll method to make ArrayList empty so the it can store next value after
				 * compare
				 */
				al2.removeAll(al2);
			}
			al1.removeAll(al1);
		}
	}

	/**
	 * function to check number is palindrome or not
	 * 
	 * @param n int to pass number which we want to check
	 * @return true or false that number is palindrome or not
	 */
	public static boolean palindrome(int n) {
		/*
		 * for palindrome we need minimum two digit number so if number is greater then
		 * 9 then only possible it is palindrome
		 */
		if (n > 9) {
			/*
			 * ArrayList al is to save number one by one digit while loop to retrieve digit
			 * from number one by one
			 */
			ArrayList<Integer> al = new ArrayList<Integer>();
			int temp;
			while (n > 0) {
				temp = n % 10;
				al.add(temp);
				n = n / 10;
			}
			/*
			 * temp2 last index of ArrayList for loop to check value form 0 index and temp2
			 * to check value value from last index if at any point value is unequal then
			 * return false otherwise true
			 */
			int temp2 = al.size() - 1;
			for (int i = 0; i < al.size() / 2; i++) {

				if (al.get(i) != al.get(temp2)) {
					return false;
				}
				temp2--;
			}

			return true;
		}
		return false;
	}

	/**
	 * function to print prime number 0 to 1000
	 * 
	 * @return ArrayList of prime number
	 */
	public static ArrayList<Integer> primeNumbers() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		/*
		 * for loop initialize from 2 because 0 and 1 are not prime number
		 */
		for (int i = 2; i < 1000; i++) {
			/*
			 * for loop to check that number is divisible by any other number or not if it
			 * is divisible by any other number then loop will break and return false
			 */

			boolean b = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			/*
			 * if number is divisible by only one and itself
			 * the it will add to ArrayList
			 */
			if (b == true) {
				al.add(i);
			}
		}
		return al;
	}
	
	/**
	 * function to perform binary search on array
	 * @param n int is a number which we want to search in array
	 * @param arr int type array in which we perform search operation
	 * @return int value which is index of the number in array list.
	 * if number is not present in Array the it will return -1
	 */
	public static int binarySearch(int n, int[] arr) {
		/*
		 * insertionSort to sort the array because binary search can perform only
		 * on sorted array 
		 */
		int[] ar = insertionSort(arr);
		
		int low = 0;
		int hig = ar.length - 1;
		int mid = 0;
		while (low <= hig) {

			mid = (low + hig) / 2;

			if (ar[mid] < n) {
				low = mid + 1;
			} else if (ar[mid] > n) {
				hig = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int binarySearch(String s, String[] arr) {
		String[] ar = insertionSort(arr);
		int low = 0;
		int hig = ar.length - 1;
		int mid = 0;
		while (low <= hig) {
			mid = (low + hig) / 2;
			if (s.equalsIgnoreCase(ar[mid])) {
				return mid;
			} else if (s.compareToIgnoreCase(ar[mid]) < 0) {
				hig = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int[] insertionSort(int[] ar) {

		for (int i = 1; i < ar.length; i++) {
			int temp = ar[i];
			int k = i - 1;
			while (k >= 0 && ar[k] > temp) {
				ar[k + 1] = ar[k];
				k--;
			}
			ar[k + 1] = temp;

		}
		for (int i : ar) {
			System.out.println(i);
		}
		return ar;
	}

	public static String[] insertionSort(String[] ar) {
		for (int i = 1; i < ar.length; i++) {
			String temp = ar[i];
			int k = i - 1;
			while (k >= 0 && temp.compareToIgnoreCase(ar[k]) < 0) {
				ar[k + 1] = ar[k];
				k--;
			}
			ar[k + 1] = temp;

		}
		for (String i : ar) {
			System.out.println(i);
		}
		return ar;
	}

	public static void bubbleSort(int[] ar) {
		int j;
		for (int k = 0; k < ar.length / 2 + 1; k++) {
			for (int i = 0; i < ar.length - 1; i++) {
				j = i + 1;
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i : ar) {
			System.out.println(i);
		}
	}

	public static void bubbleSort(String[] ar) {
		int j;
		for (int k = 0; k < ar.length / 2 + 1; k++) {
			for (int i = 0; i < ar.length - 1; i++) {
				j = i + 1;
				if (ar[i].compareToIgnoreCase(ar[j]) > 0) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (String i : ar) {
			System.out.println(i);
		}
	}

	public static void temperaturConversion(String s) {
		int n = Integer.parseInt(s.substring(0, s.length() - 1));
		if (s.contains("f") || s.contains("F")) {
			System.out.println(((n - 32) * 5 / 9) + "c");
		} else if (s.contains("c") || s.contains("c")) {
			System.out.println(((n * 9 / 5) + 32) + "f");
		}
	}

	public static double monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double pri = P * r / (1 - Math.pow((1 + r), (-n)));
		return pri;
	}

	public static void dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		System.out.println(d0);
	}

	public static void main(String[] args) {

	}
}
