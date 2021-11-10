package Algorthim_Programs;

public class BubbleSort {

	public static int[] sort(int array[], int length) {
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > (array[j])) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 35, 3, 60, 9, 75, 40, 26 };
		int sortedArray[] = sort(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
}
