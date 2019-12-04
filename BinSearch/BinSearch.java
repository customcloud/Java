
public class BinSearch {

	public static void main(String[] args) {
		System.out.println(searchIn(0));
	}
	
	public static boolean searchIn(int v) {
		int pivot;
		int l = 0;
		int r = array.length - 1;
		while (l < r) {
			pivot = (l + r) / 2;
			if (array[pivot] < v) {
				l = pivot + 1;
			} else if (array[pivot] > v) {
				r = pivot - 1;
			} else {
				return true;
			}
		}
		return false;
	}
	
	private static int[] array = new int[] {1, 2, 3, 4, 5};

}
