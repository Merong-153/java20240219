package c04.lecture.p1if;

import java.util.Random;

public class C01If {
    public static void main(String[] args) {



        Random random = new Random();

        System.out.println("명령문 1");
        if(random.nextInt(10)%2 == 0){
            System.out.println("명령문 2");
        }else {
            System.out.println("명령문 3");
        }
        System.out.println("명령문 4");
        System.out.println("명령문 5");
        System.out.println("명령문 6");
    }
}
