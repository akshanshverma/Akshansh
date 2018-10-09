import java.util.Scanner;

/******************************************************************************
 * Purpose: Main Runner class to check that words are anagram or not
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 04-10-2018
 *
 ******************************************************************************/
public class AnagramRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st word");
		String a = sc.next();
		System.out.println("enter 2nd word");
		String b = sc.next();
		// call anagram method
		Util.anagram(a, b);
		sc.close();
	}
}
