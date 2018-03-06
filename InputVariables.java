import java.util.Scanner;
public class InputVariables {
private static Scanner in;

// 这里测试输入变量及根据输入变量判断
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入参与计算的第一个数");
		int firstNumber = in.nextInt(); //创建变量，第一个数
		System.out.println("请输入参与计算的第二个数");
		int secondNumber = in.nextInt(); //创建变量，第一个数
		if (((firstNumber + secondNumber) % 2)==0) {
			System.out.println("他们的和为偶数");
		} else {
			System.out.println("他们的和为奇数");
		}
	}

}
