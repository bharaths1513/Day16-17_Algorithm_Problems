package Algorthim_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = o.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter Array Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = o.next();
		}

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter The Value to Search");
		String x = o.next();
		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = x.compareTo(arr[m]);
			if (res == 0)
				return m;
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}

		return -1;
	}
}
