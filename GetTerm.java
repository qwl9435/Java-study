import java.util.Scanner;
public class GetTerm {
	private static Scanner in;
	// 这里测试输入变量及根据输入变量判断
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入一个0~5之间的小数");
		double aNumber = in.nextDouble(); //创建变量
		int remainder = 0;
		remainder = (int) aNumber;
		System.out.println("整数部分是" + remainder);
	}
	
}
