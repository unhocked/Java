package cn.itcast.day04.demo03;
/*
* 使用方法的时候,注意事项:
* 1.方法应该定义在类当中,但是不能在方法当中再定义方法,等于说方法不能嵌套
* 2.方法定义的前后顺序无所谓.
* 3.方法定义之后不会自动执行,如果需要执行一定要调用
*   调用方法的三种模式分别为:
*                           单独调用
*                           打印调用
*                           赋值调用
* 4.如果方法有返回值,那么必须写上 return 返回值,不能没有
* 5.return后面的返回值数据,必须和方法的返回值类型,对应起来
* 6.对于一个viod没有返回值的方法,不能写return后面的返回值,只能写return自己
* 7.对于方法当中最后一行的return可以省略不写.
* 8.一个方法当中可以有多个return语句,但是必须保证同时只有一个被执行到,两个return不能连写
*
* */

public class Demo04MethodNotice {
	public static void main(String[] args) {
		System.out.println(	getMax(10,20));
	}
				//void类型 没有返回值
	public static void method2(){
		//return 20; //错误写法,方法没有返回值,return后面就不能有返回值
		return;//没有返回值,只是结束方法的执行而已.
	}

	public static void method3(){
		System.out.println("aaaa");
		System.out.println("bbbb");
		//return 没有返回值的方法内, 最后一行的return可以省略
	}

	public static int getMax(int a, int b){
		//int max;
		//if(a > b){
		//	max = b;
		//}else{
		//	max = b;
		//}
		//return max;

		if( a > b){
			return a;
		}else{
			return b;
		}

	}


}
