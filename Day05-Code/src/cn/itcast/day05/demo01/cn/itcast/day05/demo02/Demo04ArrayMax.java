package cn.itcast.day05.demo01.cn.itcast.day05.demo02;

public class Demo04ArrayMax {
	public static void main(String[] args) {
		int[] arrayA = { 5,15,25,30,10000};

		int max = arrayA[0];

		for (int i = 1; i < arrayA.length; i++) {


			if(arrayA[i] > max){
				max = arrayA[i];
			}
		}

		System.out.println(max);
	}

}
