package chap06;

import java.util.Scanner;

public class whlie03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bContinue = 1;
		
		while (bContinue == 1) {
			System.out.println("숫자를 입력하세요.");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			
			if (num % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			}
			else {
				System.out.println(">> 홀수입니다.");
			}
			
			System.out.println("계속 진행 하시겠습니까? (0-멈춤/1-계속1) : " );
			bContinue = input.nextInt();
		}
		System.out.println("다음에 또 봐요 ㅗ");
	}

}
