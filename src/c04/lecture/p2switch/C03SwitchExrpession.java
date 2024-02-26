package c04.lecture.p2switch;

public class C03SwitchExrpession {
    public static void main(String[] args) {
        // switch expression : java 12부터

        int value = 1;
        switch (value) {
            case 1 -> System.out.println("statement 1");
            case 2 -> System.out.println("statement 2");

        }
        System.out.println("statement 3");
        System.out.println("statement 4");
        System.out.println("statement 5");
    }
}
