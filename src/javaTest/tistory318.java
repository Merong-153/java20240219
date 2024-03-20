package javaTest;

import java.util.ArrayList;

public class tistory318 {



}
class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);




// list에 1가 있는지 검색 : true
        System.out.println(list.contains(1));


// list에 3가 있는지 순차적으로 검색하고 index를 반환 (만일 없으면 -1)
        System.out.println(list.indexOf(3));


// list에 D가 있는지 역순으로 검색하고 index를 반환 (만일 없으면 -1)
        System.out.println(list.lastIndexOf(3));
         // 3

    }
}






