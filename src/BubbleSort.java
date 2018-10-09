import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/******************************************************************************
 * Purpose: to sort the int value of file with the help of bubble sort
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/
public class BubbleSort {
	/**
	 * function to read file and store single digit of file in ArrayList
	 * 
	 * @return ArrayList which hold all digit
	 * @throws Exception fileNotFoundException
	 */
	public static ArrayList<Integer> readFile() throws Exception {
		File f = new File("/home/pc/Akshansh/akku.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		ArrayList<Integer> al = new ArrayList<Integer>();
		int n;

		// read file charter wise and store it in ArrayList
		while ((n = bf.read()) != -1) {
			if (n != 10) {
				al.add(n - 48);
			}
		}
		bf.close();
		return al;
	}

	/**
	 * Function to sort the value of array list with the help of bubble sort
	 * 
	 * @param arr ArrayList which we want to sort
	 */
	public static void sort(ArrayList<Integer> arr) {
		// to save all the value of ArrayList into array
		Integer[] ar = arr.toArray(new Integer[arr.size()]);

		int j;
		// for loop for maximum attempt to sort the array
		for (int k = 0; k < ar.length; k++) {
			// to perform shift operation on two value until the are sorted
			for (int i = 0; i < ar.length - 1; i++) {
				// j is to get next value
				j = i + 1;
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

		// to print sorted array
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
