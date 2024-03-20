package javaTest.tistory320;

import java.util.*;

public class setClass {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // 중복된 요소 추가

        System.out.println(hashSet.size());

        System.out.println(hashSet.toString());




        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(5);

        System.out.println(treeSet.toString());






        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(50);

        stack.pop(); // 50
        stack.pop(); // 30








        Queue<String> linkedList = new LinkedList<>(); // Queue 타입으로 받음

        linkedList.offer("Hello");
        linkedList.offer("World");
        linkedList.offer("Power");

        linkedList.poll(); // "Hello" - 선입선출

        System.out.println(linkedList); // [World, Power]
    }
}



