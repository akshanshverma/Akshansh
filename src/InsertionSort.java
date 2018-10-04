import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class InsertionSort {
	public static String[] readFile() throws Exception {
		File f = new File("/home/pc/Akshansh/akku.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String st, s = null;
		while ((st = bf.readLine()) != null) {
			s = st;
		}
		String[] sArr = s.split(" ");
		bf.close();
		return sArr;
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

	public static void main(String[] args) {
		String[] st = null;
		try {
			st = readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (String string : st) {
			System.out.print(string + " ");
		}
		System.out.println();
		insertionSort(st);
	}
}
