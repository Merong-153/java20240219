package javaTest.tistory313;

import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class LeetCode1700 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = {1,1,1,0,0,1};
        int[] b = {1,0,0,0,1,1};

        System.out.println(solution.countStudents(a,b));
    }
}


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwich = new LinkedList<>();

        for (int s : students) {
            student.offer(s);
        }

        for (int s : sandwiches) {
            sandwich.offer(s);
        }

        int cnt =0;
        while (!student.isEmpty()) {
            if (student.peek().equals(sandwich.peek())) { // peek()를 사용하여 비교
                student.poll(); // poll()은 인자를 받지 않음
                sandwich.poll();
                System.out.println(student);
                System.out.println(sandwich);
                cnt =0;
            } else {
                student.offer(student.poll());
                cnt++;
                System.out.println(cnt);
                System.out.println(student);
                System.out.println(sandwich);

            }

            if(cnt > student.size()){
                break;
            }
        }


        return student.size(); // 남은 학생의 수 반환
    }
}

