package javaTest;

import java.util.Scanner;

public class page199num9 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int student = 0;
        boolean exit = true;
        int[] scores = new int[0];
        double sum = 0;
        while(exit){
            System.out.println("------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택 > ");
            int control = scanner.nextInt();
            if(control ==1){
                int arrlength = 0;
                System.out.print("학생수 > ");
                scores = new int[scanner.nextInt()];
                System.out.println(student);
                sum =0;
            }
            if(control ==2){
                System.out.println("점수입력 > ");
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores["+i+"]");
                    scores[i] = scanner.nextInt();
                }


            }
            if(control == 3){
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores["+i+"] : "+scores[i]);
                }
            }
            if(control == 4){
                int best = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                    if(scores[i] > best){
                        best = scores[i];
                    }
                }
                System.out.println("점수합계 : "+sum);
                System.out.println("최고점수 : "+ best);
                System.out.println("평균 점수 :"+(sum/ scores.length));
            }

            if(control==5){
                System.out.println("프로그램 종료");
                exit = false;
                scanner.close();
            }

        }
    }
}
