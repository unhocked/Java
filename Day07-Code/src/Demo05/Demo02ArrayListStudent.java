package Demo05;

import java.util.ArrayList;

/*
题目:
自定义4个学生对象,添加到集合,并遍历.

思路:
1. 自定义Student学生类,四个部分. 无参,全参,get,set
2. 创建一个集合,用来存储学生对象, 泛型: <Student>
3. 根据类,创建4个学生对象.
4. 将4个学生对象添加到集合中: add
5. 遍历集合: for,size get
 */
public class Demo02ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		Student one = new Student(20,"洪七公");
		Student one1 = new Student(21,"欧阳锋");
		Student one2 = new Student(22,"黄药师");
		Student one3 = new Student(23,"段志心");

		list.add(one);
		list.add(one1);
		list.add(one2);
		list.add(one3);
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println("姓名: "+stu.getName()+ "\t年龄: "+stu.getAge());
		}



	}
}
