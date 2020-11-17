import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Easy1TwoSum
 * @Description TODO
 * @Author xinwang41
 * @Date 2020/11/17 17:15
 * @Version 1.0
 **/
public class Easy1TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //  取数组中某一数a（情况总共有n种，因为总共n个数，遍历一遍）
        for (int i = 0; i < nums.length; i++) {
            //  查找target - a是否在数组中
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            } else {
                //  可以在遍历的同时建立索引，因为到目前为止（比如i位置），如果map中没有对应结果，
                //  那么说明对应结果在没有遍历过的部分，因为map中已经索引了到i位置的所有元素对应值
                map.put(target - nums[i], i);
            }
        }
        throw new RuntimeException("No Solution");
    }
}
