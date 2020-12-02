package Demo01;

import java.util.Arrays;

public class intArrays {
	public static void main(String[] args) {
		int[] intArrays = {10,20,30,40};
		String intstr = Arrays.toString(intArrays);
		System.out.println(intstr);

		int[] arra = {1,58,8,2,1,6,8,3,1,48,69,2};
		Arrays.sort(arra);
		System.out.println(Arrays.toString(arra));
	}
}
