package ch05.lecture.p1array;

public class C15Null {
    public static void main(String[] args) {
        // null : 참조하는 객체가 없다.

        int[] arr1 = {2, 3, 4};

        System.out.println(System.identityHashCode(arr1));


        int[] arr2 = null; // 참조하는 객체가 없다.
        System.out.println(System.identityHashCode(arr2));

        System.out.println(arr1.length);
//        System.out.println(arr2.length);

    }
}
