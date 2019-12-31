package cn.itcast.day05.demo01;
/*
使用动态初始化数组的时候,其中的元素将会自动的拥有一个默认值,规则如下:
如果是整数类型,那么默认为0;
如果是浮点类型,那么默认为0.0;
如果是字符类型,那么默认为'\u0000';
如果是不二类型,那么默认为false;
如果是引用类型,那么默认为null;
 */
public class Demo05Array {
	public static void main(String[] args) {
		//动态初始化一个数组
		int[] arrayA = new int[3];//动态初始化一个长度为3的数组

		System.out.println(arrayA[0]);
		System.out.println("========================");

		//将数据123赋值交给数组array当中的1号元素
		arrayA[1] = 123;
		System.out.println(arrayA[1]);
	}
}
