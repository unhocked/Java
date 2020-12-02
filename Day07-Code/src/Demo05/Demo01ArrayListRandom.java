package Demo05;

import java.util.Random;
import java.util.ArrayList;
/*
题目:
生成6个1~33之间的随机整数,添加到集合,并遍历集合.

思路:
1. 需要存储6个数字,创建一个集合, <Integer>
2. 产生随机数,需要用到Random
3. 用循环6次来产生6个随机数字: for循环
4. 循环内调用 r.nextInt(int n)方法,参数是33, 0~32
5. 把数字添加到集合中: add
6. 遍历集合: for,size,get
 */
public class Demo01ArrayListRandom {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(33)+1;
			list.add(num);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("遍历集合后输出:"+list.get(i));
		}
		System.out.println("直接输出list集合"+list);
	}
}
