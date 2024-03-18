package for00;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("5개의 숫자를 입력하세요");
			int num = 0, sum = 0;
			
			
			for (int i = 1; i <= 5; i++); {
				num = input.nextInt();
				sum += num;
			}
		}
	}

}