package _3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int count = 0;
		boolean bl = false;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt() % 42;
			System.out.print(num[i] + " ");
		}
		
		for (int i = 0; i < num.length; i++) {
			bl = false;
			for (int j = i+1; j < num.length; j++) {
				if(num[i] == num[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) {
				count++;
			}
			System.out.print(count);
		}
//		for (int i = 0; i < 42; i++) {
//			boolean chk = false;
//			for (int j = 0; j < num.length; j++) {
//				if(i == num[j]) {
//					chk = true;
//				}
//			}
//			
//			if(chk == true) {
//				count++;
//			}
//			System.out.print(count + " ");
//		}
		sc.close();
		System.out.println(count);
	}
}
