package javaTest;

import ch08.exercise.p8.A;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {


    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(solution.getRow(5));
    }
}

class Solution {
    public List<List<Integer>> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();

        // 비교해야할 1번째 리스트
        List<Integer> prev = new ArrayList<>();
        // 처음에 1넣어야함
        prev.add(1);

        for (int i = 0; i < rowIndex; i++) {
            //새로운 배열을 만들어  prev의 값을 가져와 배열만들어야함
            // 처음에 1넣어야함
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for (int j = 1; j < prev.size() ; j++) {
                //1번 인덱스부터 시작
                //1번 인덱스와 0번 인덱스의 합을 1번 인덱스에 넣어야함
                //prev의 사이즈만큼
                int num = prev.get(j) + prev.get(j-1);
                next.add(num);
            }
            //next 마지막에 또 1넣어야함
            next.add(1);
            //next 완성 했으면 다음 next와 비교하기위해 prev에 넣음
            prev = next;
            lists.add(prev);
            //넣은 prev lists에 넣기
        }
        return lists;
    }

}