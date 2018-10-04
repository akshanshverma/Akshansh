
public class BinarySearchRunner {

	public static void main(String[] args) {
		int[] ar = { 3, 2, 5, 1, 4, 11, 43, 99, 213, 44, 13 };
		String[] st = { "dd", "cc", "bb", "aa", "zz", "gg" };
		System.out.println("index " + Util.binarySearch(99, ar));
		System.out.println("*****string*****");
		System.out.println("index " + Util.binarySearch("gg", st));
	}
}
