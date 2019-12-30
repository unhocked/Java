package cn.itcast.day04.demo02;

/*
	方法定义格式:
		public static void 方法名称(){
			方法体;
		}

		调用格式:
		方法名称();

		注意实现:
		方法定义的先后顺序无所谓;
		方法定义必须是挨着的,不能再一个方法的内部定义另外一个方法;

 */

public class Demo01Method {
	public static void main(String[] args) {
		printMethod();
	}
	public static void printMethod(){
		for (int j = 0; j < 5; j++) {
			for(int i = 0; i < 20; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
