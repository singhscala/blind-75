package arrays;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for(int x:nums){
            if(list.contains(x)){
                return true;
            }
            list.add(x);
        }

        return false;
    }
}
