
/******************************************************************************
 * Purpose: main runner of both int and String type bubble sort
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 03-10-2018
 *
 ******************************************************************************/
public class BubbleSortRunner {
	public static void main(String[] args) {
		int[] ar = { 3, 2, 5, 1, 4, 11, 43, 99, 213, 44, 13 };
		String[] st = { "dd", "cc", "bb", "aa", "zz", "gg" };
		Util.bubbleSort(ar);
		System.out.println("*****string*****");
		Util.bubbleSort(st);
	}
}
