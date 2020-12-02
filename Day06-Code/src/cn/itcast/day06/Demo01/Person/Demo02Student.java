package cn.itcast.day06.Demo01.Person;

public class Demo02Student {
	public static void main(String[] args) {
		Student stu = new Student();//无参构造
		System.out.println("==========");
		Student stu1 = new Student("赵丽颖",10);//全参构造
		System.out.println("姓名"+stu1.getName()+",年龄"+stu1.getAge());
		stu1.setName("王健林");//改变姓名与年龄
		stu1.setAge(20);
		System.out.println("姓名"+stu1.getName()+",年龄"+stu1.getAge());

	}
}
