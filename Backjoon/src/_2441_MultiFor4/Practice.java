package _2441_MultiFor4;

public class Practice {
	public static void main(String[] args) {
		int count = 5;

		for (int i = 0; i < count; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < count-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
