package cn.itcast.day06.Demo01.Person;

public class Demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
		//设置我自己的名字
		person.name = "王健林";
		person.sayHello("王思聪");

		System.out.println(person);//直接打印得到的是地址值,person变量拥有Person对象的地址值
	}
}
