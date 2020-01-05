package Demo04;

public class Demo01ArrayParam {
	public static void main(String[] args) {
		int [] array = {10,20,30,40,50};
		parintArray(array);
		System.out.println("=======AAAA=======");
		parintArray(array);
	}

	/*
	三要素
	返回值类型: 只是进行打印,不需要进行细算,也没有结果,所有用void
	方法名称: parintArray
	参数列表: 必须给我数组,我才能打印其中的元素. int[] array
	 */

	public static void parintArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
