package Demo04;

import java.util.Arrays;

public class Demo03PrintArray {
	public static void main(String[] args) {
		//面向过程 ,所有步骤亲力亲为
		int[] array = {10,20,30,40,50};
		//System.out.print("[");
		//for (int i = 0; i < array.length; i++) {
		//	if(i == array.length - 1){
		//		System.out.println(array[i]+"]");
		//	}else{
		//		System.out.print(array[i]+" ,");
		//	}
		//}
		//System.out.println("=========================");
		////面向对象
		//System.out.println(Arrays.toString(array));
		int[] result = PrintArray(array);
		System.out.println("交给一个数组变量接收:"+ result);
		System.out.println("直接打印方法传入参数会将方法拿到的地址值打印出来:"+ PrintArray(array));
	}
	public static int[] PrintArray(int[] arrays){
		System.out.print("[");
		for (int i = 0; i < arrays.length; i++) {
			if(i == arrays.length - 1){
				System.out.println(arrays[i]+"]");
			}else{
				System.out.print(arrays[i]+" ,");
			}
		}
		return arrays;
	}
}
