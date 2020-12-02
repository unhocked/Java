package Demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
	public static void main(String[] args) {
		//创建一个ArrayList集合,集合的名称是list,里面装的都是字符串类型;
		//备注:从1.7+开始,右侧尖括号内可以不写内容,但尖括号本身必须要写
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);

		//向集合当中添加一些数据,需要用到add方法
		list.add("赵丽颖");
		System.out.println(list);
		list.add("马儿扎哈");
		list.add("马儿扎哈");
		list.add("马儿扎哈");
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
