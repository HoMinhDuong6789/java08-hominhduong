package ex02;

public class Ex02 {
	/*
	 * Bài 02: Viết chương trình tính tổng S = 4! +7! + 12! + 18!
	 */
	public static void main(String[] args) {
		Ex02 b= new Ex02();
		System.out.println(b.factorial(4)+b.factorial(7)+b.factorial(12)+b.factorial(18));
	}

	long factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
