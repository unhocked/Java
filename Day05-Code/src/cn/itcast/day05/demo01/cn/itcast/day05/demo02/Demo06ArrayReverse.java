package cn.itcast.day05.demo01.cn.itcast.day05.demo02;
/*
数组元素的反转:
要求不能使用新数组,就用原来的唯一一个数组
 */
public class Demo06ArrayReverse {
	public static void main(String[] args) {
		//如何交换两个变量的值
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("============");
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(temp);
		System.out.println("============");
		//数组反转
		int[] arrayA = new int[]{1,2,3,4,5,8};
		for (int min = 0,max = arrayA.length-1; min < max; min++,max--) {
			int stemp = arrayA[min];
			arrayA[min] = arrayA[max];
			arrayA[max] = stemp;
		}
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}

	}
}
