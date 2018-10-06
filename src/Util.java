import java.util.ArrayList;

public class Util {
	public static boolean anagram(String a, String b) {
		if (a.length() == b.length()) {
			char[] ar = a.toCharArray();
			char[] br = b.toCharArray();
			ArrayList<Character> al = new ArrayList<Character>();
			ArrayList<Character> bl = new ArrayList<Character>();

			for (char c : ar) {
				al.add(c);
			}
			for (char ch : br) {
				bl.add(ch);
			}
			for (Character character : bl) {
				if (al.contains(character)) {
					al.remove(character);
				}
			}
			if (al.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static void anagramInt(ArrayList<Integer> alMain) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		int temp1, temp2;
		for (int i = 0; i < alMain.size() - 1; i++) {
			int n1 = alMain.get(i);
			while (n1 > 0) {
				temp1 = n1 % 10;
				al1.add(temp1);
				n1 = n1 / 10;
			}
			for (int j = i + 1; j < alMain.size(); j++) {
				int n2 = alMain.get(j);
				while (n2 > 0) {
					temp2 = n2 % 10;
					al2.add(temp2);
					n2 = n2 / 10;
				}
				for (Integer it : al1) {
					if (al2.contains(it)) {
						al2.remove(it);
					}
				}
				if (al2.isEmpty()) {
					System.out.println(alMain.get(i) + " " + alMain.get(j));
				}
				al2.removeAll(al2);
			}
			al1.removeAll(al1);
		}
	}

	public static boolean palindrome(int n) {

		if (n > 9) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			int temp;
			while (n > 0) {
				temp = n % 10;
				al.add(temp);
				n = n / 10;
			}

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

	public static ArrayList<Integer> primeNumbers() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 2; i < 1000; i++) {
			boolean b = true;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				al.add(i);
			}
		}
		return al;
	}

	public static int binarySearch(int n, int[] arr) {
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
