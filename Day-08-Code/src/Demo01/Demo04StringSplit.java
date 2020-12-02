package Demo01;
/*

 */
public class Demo04StringSplit {

	public static void main(String[] args) {
		String str1 = "abc,abc,abc";
		String[] array = str1.split(",");
		System.out.println(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=================");

		String str2 = "aaa bbb ccc";
		String[] array2 = str2.split(" ");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
