package cn.itcast.day06;
/*
对于基本类型当中的boolean值,getter方法一定要写成isXXXX   而setter规则不变
 */
public class Student02 {
	private String name; //姓名
	private int age;    //年龄
	private boolean male; //未知

	public void setMale(boolean b){

		male = b;
	}
	public boolean isMale(){
		if(male){
			System.out.println("男");
		}else{
			System.out.println("女");
		}
		return male;
	}

	public void setName(String str){
		name = str;
	}

	public String getName(){
		return name;
	}

	public void setAge(int ages){
		age = ages;
	}

	public int getAge(){
		return age;
	}
}

