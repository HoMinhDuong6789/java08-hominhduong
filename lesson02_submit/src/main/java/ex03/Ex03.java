package ex03;

public class Ex03 {
	/*
	 * Bài 03: Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
	 * VD: 121 13331 là số đối xứng.
	 */
	public static void main(String[] args) {
		System.out.println(isSymmetry(1221));
	}
	
	private static boolean isSymmetry(int n) {
		int op = 0;
		int ip = n;
		while (n != 0) {
			int tmp = n % 10;
			op = op * 10 + tmp;
			n = n / 10;
		}
		if (op == ip) {
			return true;
		}
		return false;
	}
	
}
