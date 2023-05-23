package _10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			if(A[i] < 1 || A[i] > 10000) {
				System.out.println("입력한 정수가 잘못됐습니다. 처음부터 다시 입력하세요.");
				i = -1;
			}
		}
		sc.close();
		for (int i = 0; i < A.length; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
