package ch05.lecture.p2string;

import java.util.Arrays;

public class C10Split {
    public static void main(String[] args) {


        String s1 = "hello world";
        String[] words1 = s1.split(" ");

        System.out.println(words1.length);
        System.out.println(words1[0]);
        System.out.println(words1[1]);

        String s2 = "css,html,java,hello";
        String[] words2 = s2.split(",");

        System.out.println(Arrays.toString(words2));

    }
}
