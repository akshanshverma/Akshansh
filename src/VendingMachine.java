public class VendingMachine {
	static int total = 0;
	// 1, 2, 5, 10, 50, 100, 500 and 1000
	public static void cal(int n) {
		if (n == 0) {
			return;
		} else {

			int[] rs = { 1000, 500, 100, 50, 10, 5, 2, 1 };
			int temp = 0;
			for (int i = 0; i < rs.length; i++) {
				if (n >= rs[i]) {
					temp = n / rs[i];
					n = n % rs[i];
					System.out.println(rs[i] + "rs = " + temp);
					total = total + temp;
					cal(n);
					return;
				}
			}
			return;
		}
	}

	public static void main(String[] args) {
		cal(1001);
		System.out.println("minimum Note needed " + total);
	}
}
