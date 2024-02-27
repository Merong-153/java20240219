package javaTest;

import java.util.Scanner;

public class page138Bank {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        long money = 0L;
        boolean exit = true;
        while(exit){
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3,잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 > ");
            long control = scanner.nextLong();
            if(control ==1){
                System.out.print("예금액 > ");
                control = scanner.nextLong();
                money = control;
                System.out.println(money);
            }
            if(control ==2){
                System.out.print("출금액 > ");
                control = scanner.nextLong();
                if(control> money){
                    System.out.println("보유하신 금액보다 많습니다!");
                    System.out.println("잔고 : "+money);
                }else{
                    money = money - control;
                }
            }
            if(control == 3){
                System.out.println("잔고 > "+money);
            }
            if(control == 4){
                System.out.println("프로그램 종료");
                exit = false;
                scanner.close();
            }

        }
    }
}
