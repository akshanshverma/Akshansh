import java.util.Scanner;

/******************************************************************************
 * Purpose: Helper class containing static method.
 *
 * @author Akshansh Verma
 * @version 1.0
 * @since 03-10-2018
 *
 ******************************************************************************/

public class DayOfWeekRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day");
		int d = sc.nextInt();
		System.out.println("enter month");
		int m = sc.nextInt();
		System.out.println("enter year");
		int y = sc.nextInt();
		// call method dayOfWeek of Util class
		Util.dayOfWeek(d, m, y);
		sc.close();
	}

}
