import java.util.ArrayList;

public class PrimeNumberRunner {

	public static void main(String[] args) {
		ArrayList<Integer> prime = Util.primeNumbers();

		for (Integer al : prime) {
			System.out.println(al);
		}
		System.out.println("*****anagram*****");
		Util.anagramInt(prime);
		System.out.println("*****palindrome*****");
		boolean b;
		for (Integer integer : prime) {
			b = Util.palindrome(integer);
			if (b) {
				System.out.println(integer);
			}
		}
	}
}
