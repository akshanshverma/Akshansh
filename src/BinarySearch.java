import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/******************************************************************************
 * Purpose: to read the String from file and check word is present in string or
 * not with the help of binary search
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/
public class BinarySearch {
	/**
	 * function to read file and store the word of file in String type array
	 * 
	 * @return string type array which hold words of file
	 * @throws Exception fileNotFoundExceotion
	 */
	public static String[] readFile() throws Exception {
		File f = new File("/home/pc/Akshansh/akku.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String st, s = null;
		// while loop to hold line in single string
		while ((st = bf.readLine()) != null) {
			s = st;
		}
		// s.split will save all word in string type array
		String[] sArr = s.split(" ");
		bf.close();
		return sArr;
	}

	/**
	 * function to check word is present in file or not with the help of binary
	 * search
	 * 
	 * @param s  String word which we want to search
	 * @param ar String type array in which we are going to search
	 * @return
	 */
	public static int search(String s, String[] ar) {
		/*
		 * Arrays.sort to sort the array because binary search can perform only on
		 * sorted array
		 */
		Arrays.sort(ar);
		for (String string : ar) {
			System.out.println(string);
		}
		/*
		 * low is lower index of array hig is last index of array mid is to store mid
		 * index of low and last index
		 */
		int low = 0;
		int hig = ar.length - 1;
		int mid = 0;
		while (low <= hig) {
			mid = (low + hig) / 2;
			/*
			 * if s is equal to mid value then it will return the index of mid value else we
			 * compare s with with mid value if it return -ve value then s is less then mid
			 * or if it return +ve value then s is greater then mid
			 */
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
