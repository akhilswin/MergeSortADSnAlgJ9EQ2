package yaksha;

public class MainClass {
	public static void main(String args[]) {
		int arr[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		MergeSort ob = new MergeSort();
		int result[] = ob.mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(result[i] + "");
		}
	}
}
