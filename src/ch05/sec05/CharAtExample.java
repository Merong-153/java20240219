package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt((int)(Math.random()*9)+1);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("외계인이세요?");
        }
    }
}
