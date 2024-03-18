package chap06;

import java.util.Scanner;

public class whlie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("숫자를 입력하세요. 0을 입력하면 덧셈이 멈춥니다.");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        
        System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
        scanner.close();
    }
}