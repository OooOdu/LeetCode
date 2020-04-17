package LeetCode;

public class L26删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
        //1.如果nums数组中没有元素或者只含有1个元素，则不存在重复的元素，返回数组的长度
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        } else {
            //2.双指针 index为慢指针记录数组的长度，i为快指针，遍历数组
            int index = 0;
            for (int i = 1; i < nums.length; i++) {
                //3.如果两个数不相同，数组长度+1，将后一个数赋值给nums[index]，如此反复
                if (nums[index] != nums[i]) {
                    index++;
                    nums[index] = nums[i];
                }
            }
            return index + 1;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nums[] = {2, 1, 3, 3};
        System.out.println(removeDuplicates(nums));

    }

}
