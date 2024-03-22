package javaTest.LeetCode1512;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode1512 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int g =0;
        for (int num : nums){
            g = g + count[num];
            count[num]++;
        }
        return g;

    }
}