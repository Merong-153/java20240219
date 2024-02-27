package javaTest;

public class page199 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if(num < array[i]){
                num = array[i];
            }
        }
        System.out.println("최대값 : "+num);
    }
}
