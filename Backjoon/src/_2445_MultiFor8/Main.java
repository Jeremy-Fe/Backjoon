package _2445_MultiFor8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (num-i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i*2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}