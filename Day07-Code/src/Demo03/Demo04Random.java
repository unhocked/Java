package Demo03;

import java.util.Random;
import java.util.Scanner;

/*
题目:
用代码模拟猜数字游戏.

思路:
1: 首先需要产生一个随机数字,并且一旦产生不再变化,用Random的nextInt方法
2: 需要键盘输入, 需要使用Scanner
3: 获取键盘输入的数字,用Scanner当中的nextInt方法
4: 已经得到了两个数字,判断(if)一下:
	如果太大,给出提示并重试;
	如果太小,给出提示并重试;
	如果猜中则结束游戏;
 */
public class Demo04Random {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int ranNum = random.nextInt(100) + 1;
		System.out.println("请输入一个数字:");
		int scNum = sc.nextInt();

		while(true){
			if(scNum > ranNum){
				System.out.println("这个数字大了,请重新输入:");
				scNum = sc.nextInt();
				//continue;
			}else if(scNum < ranNum){
				System.out.println("这个数字小了,请重新输入:");
				scNum = sc.nextInt();
			}else{
				System.out.println("猜中了");
				break;
			}

		}
		System.out.println("游戏结束");
	}
}
