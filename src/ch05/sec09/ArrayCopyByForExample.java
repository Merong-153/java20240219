package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};

        int[] newIntAray = new int[5];

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntAray[i] = oldIntArray[i];
        }

        for (int i = 0; i < newIntAray.length; i++) {
            System.out.println(newIntAray[i]+", ");
        }


    }
}
