package Demo01;

/*
获取键盘输入的一个int数字: int num = sc.nextInt();
获取键盘输入的一个字符串: String str = sc.next();

 */
import java.util.Scanner;
public class Demo01Scanner {
	public static void main(String[] args) {
		//创建Scanner对象
		//备注: System.in代表从键盘输入
		Scanner sc = new Scanner(System.in);


		int num = sc.nextInt();
		System.out.println("输入的数字是:"+num);

		String str = sc.next();
		System.out.println("输入的字符串是:"+str);
	}
}
