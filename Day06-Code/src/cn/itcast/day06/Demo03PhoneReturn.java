package cn.itcast.day06;

public class Demo03PhoneReturn {
	public static void main(String[] args) {
		Phone tow = phoneReturn();
		System.out.println(tow.brand);
		System.out.println(tow.price);
		System.out.println(tow.color);
	}

	public static Phone phoneReturn(){
		Phone one = new Phone();
		one.brand = "苹果";
		one.price = 9999;
		one.color = "玫瑰金";
		return one;

	}
}
