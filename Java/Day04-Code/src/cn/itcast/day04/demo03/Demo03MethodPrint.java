package cn.itcast.day04.demo03;

/*
题目要求:
定义一个方法,用来打印指定次数的HelloWorld

*/
public class Demo03MethodPrint {
	public static void main(String[] args) {
		setPrint(40);
	}
	/*
	三要素
	返回值类型: 只是进行一堆打印操作,没有计算,也没有结果告诉调用处,所以不需要返回值
	方法名称: setPrint
	参数列表: 需要一个参数指定次数
	*/

	public static void setPrint(int num){
		for (int i = 0; i < num; i++) {
			System.out.println("我爱Java"+ (i+1));
		}

	}
}
