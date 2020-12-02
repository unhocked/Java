package Demo03;
import java.util.Random;
/*
Random类用来生成随机数字.使用起来也是三个步骤

1. 导包
2. 创建
Random r = new Random();//小括号留空即可

3. 使用
获取一个随机的int数字 (范围是int所有范围,有正负两种):int num = r.nextInt();
获取一个随机的int数字 (参数代表了范围,左闭右开区间): int nums = r.nextInt();
实际上代表的含义是: [0,3), 也就是0~2



 */
public class Demo01Random {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt();
		System.out.println("不传参的随机数"+num);
		int nums = ran.nextInt(200);
		System.out.println("传参的随机数"+nums);
	}
}
