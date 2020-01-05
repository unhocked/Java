package Demo04;

public class Demo02ArrayReturn {
	public static void main(String[] args) {
		int[] result = calcArray(1,2,3);
		System.out.println("result数组的地址值是: "+result);
		System.out.println("总和是: "+result[0]);
		System.out.println("平均数: "+result[1]);
	}

	public static int[] calcArray(int a, int b, int c){
		int sum = a + b + c;//总和
		int avg = sum / 3;//平均数
		int[] array = {sum,avg};
		System.out.println("calculate方法内部是:"+array);
		return array;
	}
}
