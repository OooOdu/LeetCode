package LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class L14最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        //1.如果数组长度为0，则返回""
        if (strs.length == 0) return "";
        //2。设置最小值，字符串result用来存放答案，使用set数据结构来完成代码
        int min = Integer.MAX_VALUE;
        String result = "";
        Set<Character> set = new LinkedHashSet<Character>();
        //3.找出数组中所有字符串长度最短的一个
        for (String string : strs) {
            if (min > string.length()) {
                min = string.length();
            }
        }
        //4.外层循环为每个字符串找的位置，内层循环是遍历数组中所有的字符串
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length; j++) {
                //5.将所有字符串的第j个字符加入到set集合中
                set.add(strs[j].charAt(i));
            }
            //6.如果set的长度为1，说明每个字符串的第J个字符军重复，所以strs[j].charAt(i)是公共子串
            if (set.size() == 1) {
                result += String.valueOf(set.iterator().next());
            } else {//如果不是1，则不算是公共子串，直接跳出循环
                break;
            }
            //7.清空set中的所有数字，进行第i+1位置的字符的判断，每次做完操作后均清空set
            set.clear();
        }

        return result;

//		//1.如果数组为空，则返回""
//		if(strs.length == 0){
//            return "";
//        }
//		//2.将数组中的第一个字符串作为匹配串result
//		String result = strs[0];
//		//3.去和数组中其他字符串进行匹配
//		for (int i = 1; i < strs.length; i++) {
//			//4.如果result不是其他字符串的前缀子串，则开始循环
//			while(strs[i].indexOf(result)!=0) {
//				//5.result取它的0——result.length()-1的长度
//				result = result.substring(0,result.length()-1);
//			}
//		}				
//		return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String strs[] = {"acb", "cba"};
        System.out.println(longestCommonPrefix(strs));

    }

}
