package javaTest.LeetCode1748;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }


}

class Solution {
public int numIdenticalPairs(int[] nums) {

    return (int)Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .values()
            .stream()
            .mapToLong(count -> (count * (count - 1)) / 2)
            .sum();


}
}

