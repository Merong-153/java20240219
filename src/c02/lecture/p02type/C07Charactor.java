package c02.lecture.p02type;

public class C07Charactor {
    public static void main(String[] args) {
        char f = 4314;
        char a = 8258;
        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        String str1 = String.valueOf(o);
        String str2 = "0x1f607";

        System.out.println("emojis = " + emojis);
        System.out.println("o = " + o);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println(f);
        System.out.println(a);
    }
}
