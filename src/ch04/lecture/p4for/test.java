package ch04.lecture.p4for;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("------2--------");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("-------3-------");
        for (int i = 0; i < 9; i += 2) {
            System.out.println(i);
        }
        System.out.println("-------4-------");
        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }
        System.out.println("------5--------");
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------6-------");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("-------7-------");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
        }
        System.out.println();
        System.out.println("-------8-------");
        int count = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < count; j++) {

                System.out.print("*");
            }
            count++;
        }
        System.out.println();
        System.out.println("-------9-------");
        int count2 = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = count2; j > 0; j--) {

                System.out.print("*");
            }
            count2--;
        }

        System.out.println();
        System.out.println("-------10-------");
        int count3 = 5;
        int count33 = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println();

            for (int j = count3; j > 0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < count33; k++) {
                System.out.print("#");
            }
            count33++;
            count3--;
        }

        System.out.println();
        System.out.println("-------11-------");
        int count4 = 5;
        int count44 = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println();

            for (int j = count4; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < count44; k++) {
                System.out.print("*");
            }
            count44++;
            count4--;
        }
        System.out.println();
        System.out.println("-------12-------");
        int count5 = 0;
        int count55 = 6;
        for (int i = 0; i < 6; i++) {
            System.out.println();

            for (int j = 0; j < count5; j++) {
                System.out.print(" ");
            }
            for (int k = count55; k > 0; k--) {
                System.out.print("*");
            }
            count55--;
            count5++;
        }

        System.out.println();
        System.out.println("------13--------");
        int count6 = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < count6; j++) {

                System.out.print(j);
            }
            count6++;
        }

        System.out.println();
        System.out.println("------14--------");
        int count7 = 1;
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println();

            for (int j = 0; j < count7; j++) {
                if (cnt == 10) {
                    cnt = 0;
                    System.out.print(cnt++);
                } else {
                    System.out.print(cnt++);
                }

            }
            count7++;
        }

        System.out.println();
        System.out.println("--------15------");
        int count8 = 1;
        int cnt2 = 1;
        for (int i = 0; i < 6; i++) {
            System.out.println();

            for (int j = 0; j < count8; j++) {
                if (cnt2 == 10) {
                    cnt2 = 0;
                    System.out.print(cnt2++);
                } else {
                    System.out.print(cnt2++);
                }

            }
            count8++;
        }


    }
}
