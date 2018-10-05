import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class BubbleSort {
	public static ArrayList<Integer> readFile() throws Exception {
		File f = new File("/home/pc/Akshansh/akku.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n;
		while ((n = bf.read()) != -1) {
			if (n != 10) {
				al.add(n - 48);
			}
		}
		bf.close();
		return al;
	}

	public static void sort(ArrayList<Integer> arr) {
		Integer[] ar = arr.toArray(new Integer[arr.size()]);
		int j;
		for (int k = 0; k < ar.length; k++) {
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

	public static void main(String[] args) {
		try {
			sort(readFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
