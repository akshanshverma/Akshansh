import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class BinarySearch {
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

	public static int search(String s, String[] ar) {
		Arrays.sort(ar);
		for (String string : ar) {
			System.out.println(string);
		}
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

	public static void main(String[] args) {
		String[] st = null;
		try {
			st = readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("index " + search("hey", st));
	}
}
