package Demo05;

import java.util.ArrayList;

/*
题目:
定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}括起来,并且以@分隔
 */
public class Demo03ArrayListPrint {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("12");
		list.add("13");
		list.add("14");

		printArrayList(list);
	}
	public static void printArrayList(ArrayList<String> list){
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if(i ==list.size() -1){
				System.out.print(name+"}");
			}else{
				System.out.print(name+"@");
			}

		}
	}
}
