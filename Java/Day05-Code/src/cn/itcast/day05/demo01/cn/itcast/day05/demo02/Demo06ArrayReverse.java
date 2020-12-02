package cn.itcast.day05.demo01.cn.itcast.day05.demo02;
/*
数组元素的反转:
要求不能使用新数组,就用原来的唯一一个数组
 */
public class Demo06ArrayReverse {
	public static void main(String[] args) {
		int[] array = {5,10,20,30,40,50,60,70,80,90};

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("================================");
		for (int min = 0,max = array.length-1;min < max; min++,max--){
			int temp = array[min];
			array[min] = array[max];
			array[max] = temp;

		}


		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}


	}
}
