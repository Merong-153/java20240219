package c04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수입력");
        score = scanner.nextInt(); // 키보드 입력 받음
        scanner.close();

        if(score >= 90) {
            System.out.println("점수가 100-90입니다");
            System.out.println("등급은 A입니다");

        }else if(score >=80){
            System.out.println("점수가 80- 89입니다");
            System.out.println("등급은 B입니다.");

        }else if(score >= 70){
            System.out.println("점수가 70-79입니다");
            System.out.println("등급은 C입니다");

        }else {
            System.out.println("점수가 70 미만입니다");
            System.out.println("등급은 D입니다");
        }
    }
}
