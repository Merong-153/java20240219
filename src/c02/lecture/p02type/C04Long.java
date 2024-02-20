package c02.lecture.p02type;

public class C04Long {
    public static void main(String[] args) {
        //long
        long a = 1234;
        long b =3_000_000_000L;
        long c =-3_000_000_000L;
        
        long var1 = 10;
        long var2 = 20L;
      //  long var3 = 10000000000; L을 안붙혀 int로 인식 int의 범위를 넘어 오류발생
        long var4 = 10000000000L;


        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
//        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
