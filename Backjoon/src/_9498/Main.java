package _9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if (score < 0 || score > 100) {
			System.out.println("점수를 다시 입력하세요.");
		} else {
			switch(score/10) {
			case 10, 9: // 백준에서 case 하나에 10, 9 를 같이 넣으면 컴파일 에러가 뜸
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
		}
		
//		if (score < 0 || score > 100) { // 코드는 위에서 아래로 내려가는 것을 이해!
//			System.out.println("점수를 다시 입력하세요.");
//		} else if (score <= 100 && score >= 90) {
//			System.out.println("A");
//		} else if (score > 79) {
//			System.out.println("B");
//		} else if (score > 69) {
//			System.out.println("C");
//		} else if (score > 59) {
//			System.out.println("D");
//		} else if (score >= 0) {
//			System.out.println("F");
//		} 

	}
}
