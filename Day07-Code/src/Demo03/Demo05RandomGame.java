package Demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo05RandomGame {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Random ran = new Random();
		int nums = ran.nextInt(100) + 1;
		System.out.println("游戏开始!请输入第一个数字:");
		int use = num.nextInt();
		for (int i = 1; i <= 10; i++) {
			if(use > nums){
				System.out.println("数字大了! 请重新输入:");
				 use = num.nextInt();
			}else if(use < nums){
				System.out.println("数字小了! 请重新输入:");
				use = num.nextInt();
			}else{
				System.out.println("正确");
				break;
			}
			System.out.println("尝试次数最10次,您已尝试"+ i + "次");
			if(i > 10){
			}
		}
		System.out.println("游戏结束");
	}
}
