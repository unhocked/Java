package Demo01;

/*
String 当中与转换相关的常用方法有:
public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes(): 获得当前字符串底层的字节数据
public String replace(CharSequence oldString, CharSequence newString)
将所有出现的老字符串替换成为新的字符串,返回替换之后结果的新字符串


 */
public class Demo03StringConvert {
	public static void main(String[] args) {
		String str1 = "英雄联盟";
		String repl = str1.replace("英雄联盟", "****");
		System.out.println(repl);

	}
}
