
public class MergeSort {

	public static void mSort(int[] ar, int low, int hig) {
		if (low == hig) {
			return;
		} else {
			int mid = (low + hig) / 2;
			mSort(ar, low, mid);
			mSort(ar, mid + 1, hig);
			merge(ar, low, mid, hig);
		}
	}

	public static void merge(int[] ar, int low, int mid, int hig) {
		int n1 = (mid - low) + 1;
		int n2 = hig - mid;

		int[] arL = new int[n1];
		int[] arR = new int[n2];

		for (int i = 0; i < arL.length; i++) {
			arL[i] = ar[low + i];
		}

		for (int i = 0; i < arR.length; i++) {
			arR[i] = ar[mid + 1 + i];
		}

		int i = 0;
		int j = 0;
		int k = low;

		while (i < n1 && j < n2) {
			if (arL[i] <= arR[j]) {
				ar[k] = arL[i];
				i++;
			} else {
				ar[k] = arR[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			ar[k] = arL[i];
			i++;
			k++;
		}
		while (j < n2) {
			ar[k] = arR[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] ar = { 2, 3, 1, 5, 4, 9, 7, 6 };
		mSort(ar, 0, ar.length - 1);
		for (int i : ar) {
			System.out.println(i);
		}
	}
}
