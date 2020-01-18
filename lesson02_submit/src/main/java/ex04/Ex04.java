package ex04;

public class Ex04 {
	/*
	 *Bài 4: Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ
	 *lớn nhất thứ hai trong dãy số và in ra.
	 *Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết quả : 19
	 */
		public static void main(String[] args) {
			int[] a = //{ 2, 4, 9, 1, 8, 7 };
				{5, 1, 9, 11, 20, 19, 17, 21, 30};
			Ex04 item = new Ex04();
			item.sapxep(a);
			item.xuat(a);
			System.out.println("\n++++++++++++++");
			System.out.println(item.maxSoLe(a));
		}
		public void xuat(int[] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		public int maxSoLe(int[] a) {
			int dem = 0;
			int max = 0;
			int j = a.length;
			while (dem < 2) {
				j -= 1;
				if (a[j] % 2 != 0) {
					max = a[j];
					dem++;
				}
			}
			return max;
		}
		public int[] sapxep(int[] a) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						int z = a[i];
						a[i] = a[j];
						a[j] = z;
					}
				}
			}
			return a;
		}
}
