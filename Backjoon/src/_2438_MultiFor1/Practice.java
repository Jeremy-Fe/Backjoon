package _2438_MultiFor1;

public class Practice {
	public static void main(String[] args) {
		int cnt = 5;
		
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
