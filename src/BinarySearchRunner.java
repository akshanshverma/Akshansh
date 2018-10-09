
public class BinarySearchRunner {
	/******************************************************************************
	 * Purpose: main runner of binary search both method String and integer type
	 *
	 * @author Akshansh Verma
	 * @version 1.0
	 * @since 03-10-2018
	 *
	 ******************************************************************************/

	public static void main(String[] args) {
		int[] ar = { 3, 2, 5, 1, 4, 11, 43, 99, 213, 44, 13 };
		String[] st = { "dd", "cc", "bb", "aa", "zz", "gg" };
		System.out.println("index " + Util.binarySearch(99, ar));
		System.out.println("*****string*****");
		System.out.println("index " + Util.binarySearch("gg", st));
	}
}
