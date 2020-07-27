package Demo04;

public class Demo01ArrayParam {
	public static void main(String[] args) {
		int [] array = {10,20,30,40,50};
		parintArray(array);
		System.out.println("=======AAAA=======");
		parintArray(array);
		System.out.println("=======AAAA=======");
		int[] result = returnArray(10531,2120,300230);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

	/*
	三要素
	返回值类型: 只是进行打印,不需要进行细算,也没有结果,所有用void
	方法名称: parintArray
	参数列表: 必须给我数组,我才能打印其中的元素. int[] array
	 */

	public static void parintArray(int[] array){
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if(i == array.length-1){
				System.out.print(array[i]+"]");
			}else{
				System.out.print(array[i]+",");
			}

		}
	}


	public static int[] returnArray(int a ,int b ,int c){
		int sum = a + b + c;
		int avg = sum /3;
		int[] array = {sum, avg};
		return array;
	}
}
