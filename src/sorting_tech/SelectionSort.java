package sorting_tech;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		int len = arr.length;
		int temp = 0;

		for (int i = 0; i < len; i++) {
			int min = i;

			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		printArray(arr);

	}

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();

		int[] arr = { 9, 2, 5, 1, 7 };
		obj.selectionSort(arr);
	}
}
