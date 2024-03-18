package for00;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 행의 수를 입력하세요: ");
        int rows = scanner.nextInt();
        
        System.out.println("1. 정사각형");
        System.out.println("2. 삼각형");
        System.out.print("원하는 패턴의 번호를 입력하세요: ");
        int pattern = scanner.nextInt();
        
        switch (pattern) {
            case 1:
                printSquare(rows);
                break;
            case 2:
                printTriangle(rows);
                break;
            default:
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
        }
        
        scanner.close();
    }
    
    // 정사각형 출력
    public static void printSquare(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // 삼각형 출력
    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}