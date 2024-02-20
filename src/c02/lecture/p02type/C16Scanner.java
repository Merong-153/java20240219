package c02.lecture.p02type;

import java.util.Scanner;

public class C16Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("이름");
        String name = scanner.nextLine();

        System.out.println("나이입력");
        String age = scanner.nextLine();

        System.out.println("나라입력");
        String country = scanner.nextLine();

        System.out.println("도시 입력");
        String address = scanner.nextLine();

        System.out.println(country+"의 "+address+"에 사는 "+age+"살 "+name+"님");

        scanner.close();
    }
}
