package LeetCode;

public class L125验证回文串 {
	
	public static boolean isPalindrome(String s) {
		//1.如果s是空字符串，则它是回文串
		if (s == null) {
			return true;
		} else {
			//2.正则表达式去掉除数字和字母以外的字符
			String regex = "[^a-zA-Z0-9]";
			String s1 = s.replaceAll(regex, "").toLowerCase();
			//3.调用stringbuilder的反转字符也可以用a[i]==a[a.length-i-1]来判断
			String s2=new StringBuilder(s1).reverse().toString();
			return s1.equals(s2);			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

}
