package for00;

import java.util.Scanner;

public class for05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("구구단을 출력할 숫자를 입력하세요 (2에서 9 사이): ");
        int number = scanner.nextInt();
        
        if (number < 2 || number > 9) {
            System.out.println("2에서 9 사이의 숫자를 입력하세요.");
        } else {
            System.out.println(number + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
        
        scanner.close();
    }
}
