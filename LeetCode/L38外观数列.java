package LeetCode;

public class L38外观数列 {
	public static String countAndSay(int n) {
		//1.先列出第一项为1，count等于1
		String s = "1";
		while(n-->1) {
			//2.用result来接收答案
			String result = "";
			int count = 1 ;
			//3.使用charAt要在末尾补充一位任意字符，来计算字符串最后一个数字是否出现过
			s = s+",";
			//4.使用charAt和subString时均要注意下表，不够可以在末尾补充一位特殊字符来进行判断
			for (int i = 0; i < s.length()-1; i++) {
				if (s.charAt(i)==s.charAt(i+1)) {
					count++;
				}
				else {
					result = result+String.valueOf(count)+String.valueOf(s.charAt(i));
					count= 1 ;
				}
			}
			s = result;			
		}
		return s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		System.out.println(countAndSay(n));

	}

}
