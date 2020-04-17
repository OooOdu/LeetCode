package LeetCode;

public class L167两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    index1 = i + 1;
                    index2 = j + 1;
                    break;
                }
            }
        }
        return new int[]{index1, index2};
    }
}
