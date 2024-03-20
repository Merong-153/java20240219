package javaTest;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2215 {



    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            list1.add(nums1[i]);
            list2.add(nums2[i]);
            System.out.println(nums1[i]);
        }
        System.out.println(list1);
        System.out.println(list2);

        for(int i =0; i < list1.size(); i++){
            for(int j = 0; j < list1.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    list1.remove(i);
                    list2.remove(j);
                }
            }
        }

        result.add(list1);
        result.add(list2);
        return result;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        System.out.println(findDifference(nums1,nums2  ));
    }
}


