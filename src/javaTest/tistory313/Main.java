package javaTest.tistory313;

// 부모 클래스
class Animal {
    public String bark() {
        return "동물이 웁니다";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            // @Override 메소드
            public String bark() {
                return "개가 짖습니다";
            }

            // 새로 정의한 메소드
            public String run() {
                return "달리기 ㄱㄱ싱";
            }
        };

        dog.bark();
//        dog.run(); // ! Error - 외부에서 호출 불가능
    }
}