package Demo01;

import java.util.Scanner;

public class Demo05StringCountPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要统计的字符串:");

		String input = sc.next();
		char[] charArray = input.toCharArray();

		int countUpper = 0;//大写字母
		int countLower = 0;//小写字母
		int countNumber = 0;//数字
		int countOther = 0;//其它字符

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if('A' <= ch && ch <= 'Z' ){
				countUpper++;
			}else if('a' <= ch && ch <= 'z'){
				countLower++;
			}else if( '0' <= ch && ch <= '9'){
				countNumber++;
			}else{
				countOther++;
			}

		}
		System.out.println("大写字符有:" +countUpper+"个" +"\n小写字符有:" +countLower+"个"+"\n数字字符有:" +countNumber+"个"+"\n其它字符有:" +countOther+"个");

	}
}
