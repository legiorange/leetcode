package org.legiorange;

import java.util.Arrays;

/**
 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/two-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

/**
 * @Author legiorange
 * @Description //TODO
 * @Date 0:24 2019/10/30
 * @Param
 * @return
 * 错误
 * class Solution {
 *     public int[] twoSum(int[] nums, int target) {
 *                 for (int i = 0; i < nums.length; i++) {
 *             for (int j = 0; j < nums.length; j++) {
 *                 if ((nums[i] + nums[j]) == target) {
 *                     return new int[]{i, j};
 *                 }
 *             }
 *         }
 *                     return new int[]{0, 0};
 *     }
 * }
 **/

public class No_1_two_sum {
    //    class Solution {
    public int[] twoSum(int[] nums, int target) {
        //长度检查

//            if (nums.length == 0){
//                return new int[]{0, 0};
//            }
// 暴力法
//        使用两层循环，外层循环计算当前元素与 targettarget 之间的差值，内层循环寻找该差值，若找到该差值，则返回两个元素的下标。
//        时间复杂度：O(n^2)。
//        空间复杂度：O(1)。
       for (int i = 0; i < nums.length; i++) {
            //声明临时变量取出两数之和的另一个数，不做加法运算直接比较缩短时间
            int lNum = target - nums[i];
            for (int j =i+1; j < nums.length; j++) {
                //i+1 减少一次循环时间
                if (lNum==nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
//            return nums;
        return new int[]{0, 0};
//        执行用时 :
//        17 ms
//        在所有 java 提交中击败了57.15% 的用户
//        内存消耗 :
//        36.2 MB
//        在所有 java 提交中击败了95.49%的用户
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
//        int[] nums ={3, 2, 4};
        int[] x = new No_1_two_sum().twoSum(nums, 9);

        System.out.println(Arrays.toString(x));
    }
}