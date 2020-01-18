package ex01;

public class Ex01 {
	/*Bài 01: Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình
	 *theo thứ tự tăng dần và chỉ dùng tối đa một biến phụ
	 * 
	 */
	public static void main(String[] args) {
		Ex01 bai01 = new Ex01();
		int a = 5, b = 8, c = 6;
		System.out.println(bai01.findMax(a, b, c));
		System.out.println(bai01.findMin(a, b, c));
	}
	
	private int findMax(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	private int findMin(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}
	
}
