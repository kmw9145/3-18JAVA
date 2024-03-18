package DoWhile;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("숫자를 입력하세요. 0을 입력하면 더하기가 종료됩니다.");
        while (true) {
            System.out.print("숫자 입력: ");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sum += number;
        }
        
        System.out.println("누적된 값: " + sum);
        scanner.close();
    }
}