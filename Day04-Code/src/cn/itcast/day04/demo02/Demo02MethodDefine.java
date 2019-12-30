package cn.itcast.day04.demo02;



/*
修饰符: 现阶段的固定揭发,public static
返回值类型: 方法最终产生的数据结果类型
方法名称: 方法的名字,规则和变量一样,小驼峰命名法
参数类型: 进入方法的数据类型
参数名称: 进入方法的数据对应的变量名称
PS: 参数如果有多个,使用逗号进行分隔
return: 两个作用,第一停止当前方法,第二将后面的结果数据返回值还给调用处
返回值: 也就是方法执行后最终产生的数据结构

注意: return后面的返回值,必须和方法名称前面的返回值类型,保持对应
方法的三种调用格式:
1.单独调用: 方法名称(参数);
2.打印调用: System.out.println(方法名称((参数));
3.赋值调用: 数据类型 变量名称 = 方法名称(参数);

注意: 此前学习的方法,返回值类型固定写为void, 这种方法只能够单独调用,不能进行打印调用或者赋值调用.

*/
public class Demo02MethodDefine {
	public static void main(String[] args) {
		//单独 调用
		sum(10,20);

		//打印 调用
		System.out.println(sum(10,20));
		System.out.println("=====================");

		//赋值 调用
		int number = sum(20,20);
		number *= 100;
		System.out.println(number);
	}
	public static int sum(int a,int b){
		int result = a + b;
		return result;
	}

}
