package cn.itcast.day06.Demo02;

public class Demo01Student {
	public static void main(String[] args) {
			Student stu = new Student();
			stu.setName("迪丽热巴");
			stu.setAge(20);
		System.out.println("姓名: "+stu.getName()+"\n年龄: "+stu.getAge());


			Student stus = new Student("赵丽颖",21);
		System.out.println("姓名: "+stus.getName()+"\n年龄: "+stus.getAge());
		stus.setAge(22);
		System.out.println("姓名: "+stus.getName()+"\n年龄: "+stus.getAge());

	}
}
