package Demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目:
用一个大集合存入20个随机数字,然后筛选其中的偶数,放到小集合中
要求使用自定义的方法来实现筛选

分析:
1. 需要创建一个集合, 用来存储integer数字:<Integer>
2. 随机数字就用random nextInt()
3. 循环20次把随机数字放入大集合
4. 自定义一个方法,用来进行筛选.
筛选,根据大集合,筛选符合要求的元素,得到小集合
三要数:
返回值类型: ArrayList小集合(里面元素个数不确定)
方法名称: getSmalllist
参数列表: ArrayList大集合(装着20个随机数字)

5. 判断是偶数 num % 2 ==0;
6. 如果是偶数就放到小集合当中,否则不放
 */
public class Demo04ArrayListReturn {
	public static void main(String[] args) {
		ArrayList<Integer> bigList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int num = random.nextInt(100) + 1;
			bigList.add(num);
		}
		ArrayList result = smallArrayList(bigList);
		System.out.println(result + "\n偶数总共有: "+result.size()+ "个");
	}

	public static ArrayList<Integer> smallArrayList(ArrayList<Integer> samllList){
		ArrayList<Integer> smallList = new ArrayList<>();
		for (int i = 0; i < samllList.size(); i++) {
			int num =samllList.get(i);

			if(num % 2 == 0){
				smallList.add(num);
			}
		}
		return smallList;
	}
}
