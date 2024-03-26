package javaTest.programmers3252;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("3141592","271");
        s.solution("500220839878","7");
        s.solution("10203","15");
        s.solution("2","5");
    }
}

class Solution {
    public int solution(String t, String p) {
        return (int) IntStream.range(0, t.length() - p.length() + 1)
                .filter(i -> Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p))
                .count();
    }
}