import java.util.Scanner;

public class GuessGame {
	public static void guess(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for true");
		System.out.println("enter 2 for false");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		
		int low = 0;
		int hig = ar.length - 1;
		int mid = 0;
		
		
		while (low < hig) {
			mid = (low + hig) / 2;
			System.out.println("number is between "+ low +" and "+mid);
			int tf = sc.nextInt();
			
			if (tf == 1) {
				hig = mid;
			}else if (tf == 2) {
				low = mid + 1;
				mid = (low + hig) / 2;
			}else {
				System.out.println("use 1 or 2");
				System.out.println();
			}
		}
		
		System.out.println("number is "+mid);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give n ");
		int n = sc.nextInt();
		int N = (int) Math.pow(2, n);
		System.out.println("Think number between 0 and " + (N - 1));
		guess(N);
		
	}
}
