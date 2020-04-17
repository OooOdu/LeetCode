package LeetCode;

public class L724寻找数组的中心索引 {
    public static int pivotIndex(int[] nums) {
//1.直接法		
        int sum1 = 0;
        //外层循环为中索引可能的位置
        for (int j = 0; j < nums.length; j++) {
            //内层循环为遍历整个数组
            for (int i = 0; i < nums.length; i++) {
                if (i < j) {
                    sum1 += nums[i];
                }
                if (i > j) {
                    sum1 -= nums[i];
                }
            }
            if (sum1 == 0) {
                return j;
            }
            sum1 = 0;
        }
        return -1;
//2.间接法
//		int sum1 = 0;//数组中所有元素的和
//		int sum2 = 0;//前i-1个元素的和
//		for (int i = 0; i < nums.length; i++) {
//			sum1 +=nums[i];
//		}
//		//利用中心索引的定义：全体数字总和=前i-1个元素和*2+第i个元素 因为中心索引左边和右边的元素和相同，所以*2
//		for (int j = 0; j < nums.length; j++) {
//			if (sum2*2+nums[j]==sum1) {
//				return j;
//			}
//			sum2 += nums[j];
//		}
//		return -1;		        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

}
