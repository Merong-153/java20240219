package c02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        //java 21
        //string template

        String name = "jane";
        String age = "50";

        String dsec = "my name is " + name + " and age is " + age;
        System.out.println(dsec);

        String dsec2 = String.format("my name is %s and age is %s", name, age);
        System.out.println("dsec2 = " + dsec2);

        String dsec3 = STR."my name is \{name} and age is \{age}";
        System.out.println("dsec3 = " + dsec3);


        String address = "서울";
        String country = "한국";

        String dsec4 = "저는 " + country + "에 있는 " + address + "에 삽니다.";
        System.out.println(dsec4);
    }
}
