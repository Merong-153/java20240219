package c04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 12) + 8;
        System.out.println("[현재시간 : " + time + "시]");


        switch (time) {
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
                break;
        }

        double  a = Math.random();
        System.out.println(a*45);
        System.out.println((a*45)+10);
    }
}
