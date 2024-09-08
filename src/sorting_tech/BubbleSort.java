package sorting_tech;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		int len = arr.length;
		int temp = 0;

		for(int i=0; i<len-1; i++) {//round will be always array_size -1;
			
			boolean flag = false; // If all the elements are sorted then no swapping will be done. If all the elements are sorted then no need to run code further.

			for(int j=0; j<len-1-i; j++) { // -1 because we are using arr[j+1], if we iterate till j=arr_len-1, then it will be arrayOutOfIndex exception.
											// -i because after each round we get the largest element sorted.
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				
			}
			if(flag == false) {
				break;
			}
		}
		
		printArray(arr);

	}
	
	public void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		
		int[] arr = {9, 2, 5, 1, 7};
		obj.bubbleSort(arr);
	}
}
