import java.util.Scanner;

public class DayOfWeekRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day");
		int d = sc.nextInt();
		System.out.println("enter month");
		int m = sc.nextInt();
		System.out.println("enter year");
		int y = sc.nextInt();

		Util.dayOfWeek(d, m, y);
		sc.close();
	}

}
