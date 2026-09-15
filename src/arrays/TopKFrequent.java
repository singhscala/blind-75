package arrays;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }

    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a,b)->map.get(b)-map.get(a));

        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
