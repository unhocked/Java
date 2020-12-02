package Demo01;

public class Demo01StringConcat {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Java";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		System.out.println("==================");

		//获取指定索引位置的单个字符串
		System.out.println(str1.charAt(4));
		System.out.println("==================");

		//查找参数字符串在原字符串当中出现的第一次索引位置,如果没有,返回值就是-1值
		int index = str2.indexOf("J");
		System.out.println(index);  //0
		int index2 = str2.indexOf("j");
		System.out.println(index2); //-1


	}
}
