
public class InsertionSortRunner {

	public static void main(String[] args) {
		int[] ar = { 3, 2, 5, 1, 4, 11, 43, 99, 213, 44, 13 };
		String[] st = { "dd", "cc", "bb", "aa", "zz", "gg" };
		Util.insertionSort(ar);
		System.out.println("*****string*****");
		Util.insertionSort(st);
	}
}
