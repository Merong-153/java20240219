package c02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {
        // 정수형 : byte, short, int, long
        //
        // 작은 타입의 값을 큰 크기의 타입의 변수에 할당 가능
        //반대는 안됨

        byte a = 23;

        int b = a;
        short c = a;
        long d = a;

        short e = 1234;

        int f = e;
        long g = e;


        int h = 300;

        long i =h;

        float j = 3.14f;

        double k = j;

        //정수형을 실수형에 할당 가능
        long l = 1234;
        float m = l;
        double n = l;

        //char 는 in 이상에 할당 가능

        char o = '힐';
        int p = o;
        System.out.println(p);

    }
}
