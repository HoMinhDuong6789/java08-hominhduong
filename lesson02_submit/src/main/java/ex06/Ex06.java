package ex06;

public class Ex06 {
	/*
	 * Bài 6: Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
	 */
	public static boolean nguyento(int a) {
		if (a < 2) {
			return false;
		} else {
			if (a == 2) {
				return true;
			} else {
				if (a > 2) {// chia hai or can bac hai de kiem tra
					for (int i = 2; i <= Math.sqrt(a); i++) {
						if (a % i == 0) {
							return false;
							// break;
						}
					}
				}
			}

		}
		return true;
	}
	public static void main(String[] args) {
		int n = 2;
		int dem = 0;
		while (dem < 200) {
			if (nguyento(n) == true) {
				dem++;
				if (dem == 200) {
					// System.out.println("so nguyen to dau tien thu 200 la "+n);
					break;
				}
				n++;
			} else {
				n++;
			}
		}
		System.out.println("so nguyen to thu 200 la " + n);
	}

}
