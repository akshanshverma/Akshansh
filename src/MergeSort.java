
public class MergeSort {
	public static void mSort(int[] ar, int low, int hig) {
		if (low == hig) {
			return;
		} else {
			int mid = (low + hig) / 2;
			mSort(ar, low, mid);
			mSort(ar, mid + 1, hig);
			merge(ar, low, mid + 1, hig);
			
		}
	}

	public static void merge(int[] ar, int low, int i, int hig) {

	}

	public static void main(String[] args) {
		
	}
}
