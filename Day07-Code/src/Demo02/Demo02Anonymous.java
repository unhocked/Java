package Demo02;
import java.util.Scanner;
public class Demo02Anonymous {
	public static void main(String[] args) {

		//methodParam(new Scanner(System.in));
		Scanner sc = methodReturn();
		int num = sc.nextInt();
		System.out.println(num);
	}
	/*public static void methodParam(Scanner sc){
		int num = sc.nextInt();
		System.out.println("输入的值是"+num);
	}*/

	public static Scanner methodReturn(){
		return new Scanner(System.in);
	}
}
