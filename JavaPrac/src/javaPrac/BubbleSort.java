package javaPrac;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i <arr.length-1; i++) {
			for (int j = 0; j < n -i- 1; j++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
