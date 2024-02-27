package ch04.lecture.p2switch;

public class C01Stiwch {
    public static void main(String[] args) {

        System.out.println("statement 1");
        String city = "서울";
        switch("서울"){//값이 "서울:
            case "서울":
                System.out.println("statement 2");
                break;
            //"제주"
            case "제주":
                System.out.println("statement 3");
                break;
            //부산
            case "부산":
                System.out.println("statement 4");
                break;
        }
        System.out.println("statement 5");
        System.out.println("statement 6");
        System.out.println("statement 7");
        System.out.println("statement 8");
        System.out.println("statement 9");
    }
}
