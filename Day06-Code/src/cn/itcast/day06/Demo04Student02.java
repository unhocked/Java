package cn.itcast.day06;

public class Demo04Student02 {
	public static void main(String[] args) {
		Student02 stu02 = new Student02();

		stu02.setName("鹿晗同学");
		stu02.setAge(20);
		stu02.setMale(true);

		System.out.println("姓名:" + stu02.getName());
		System.out.println("年龄:" + stu02.getAge());
		System.out.println("性别:" + stu02.isMale());
	}
}
