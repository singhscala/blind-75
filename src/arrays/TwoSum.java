package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> list = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int value = target - arr[i];

            if(list.containsKey(value)){
                return new int[]{list.get(value), i};
            }

            list.put(arr[i], i);
        }
        return new int[]{};
    }
}
