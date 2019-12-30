package cn.itcast.day04.demo03;
/*
题目要求:
	定义一个方法,用来判断两个数字是否相同.
*/

public class Demo01MethodSame {
	public static void main(String[] args) {
		boolean a = isSame(12,12);
		System.out.println(a);
	}
	public static boolean isSame(int a, int b){
		//boolean same = a==b? true: false;
			return a==b;

		/*boolean same;
		if(a==b){
			same = true;
		}else{
			same = false;
		}
		return same;*/
	}
}
