package ex07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex07 {
	/*
	 * Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30. Yêu cầu: 5 số
	 * ngẫu nhiên không được trùng nhau và trả về mảng 1 chiều Gợi ý: Cách khai báo
	 * mảng: 1. int[] a = new int[5]; // a gồm 5 phần tử, giá trị mặc định bằng 0 2.
	 * int[] a = {7,2,9,4}; // a gồm 4 phần tử, với a[0] = 7, ... a[3] = 4
	 */

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rd = new Random();
		 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Ex07.randomNum(20, 30);

			if (i == 0) {
				continue;
			} else {
				for (int j = 0; j < i; j++) {
					while (arr[j] == arr[i]) {
						arr[i] = Ex07.randomNum(20, 30);
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int randomNum(int a, int b) {
		Random rd = new Random();
		return rd.nextInt((30 - 20) + 1) + 20;
	}

}
