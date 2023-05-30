package _10039;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		int avg = 0;
		
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(score[i] < 0 || score[i] > 100 || score[i] % 5 != 0) {
				System.out.println("점수를 잘못 입력하였습니다. 다시 입력하세요.");
				i = -1;
				sum = 0;
			}
			if(score[i] < 40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		
		avg = sum / score.length; 
		
		System.out.println(avg);
		
	}
}
