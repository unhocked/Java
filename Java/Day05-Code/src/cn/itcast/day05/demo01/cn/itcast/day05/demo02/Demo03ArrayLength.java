package cn.itcast.day05.demo01.cn.itcast.day05.demo02;

/*
数组一旦创建,程序运行期间,长度不可改变.
 */
public class Demo03ArrayLength {
	public static int main(String[] args) {
		int[] arrayA = new int[]{10,20,30,40};
		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
		System.out.println(arrayA[2]);
		System.out.println(arrayA[3]);
		System.out.println("================");
		arrayA = new int[]{20,30,40};
		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
		System.out.println(arrayA[2]);
		System.out.println("================");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		System.out.println("================");
		int a = 0;
		return a;
		//arrayA.fori
	}
}
