package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
	public static void main(String[] args) {
		//我是main方法,我来调用getSum方法
		//我调用你,帮我计算,把结果告诉我的num变量
		int num = getSum(20,30);
		System.out.println("返回值是"+ num);
	}
	//我是一个方法,我负责两个数字相加
	//我有返回值int,谁调用我,我就把计算结果告诉谁
	public static int getSum(int a, int b){
		int result = a + b;
		return result;
	}

}
