import java.util.Scanner;
public class Grade {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("请输入成绩（0~10）");
		int grade = sc.nextInt();
		switch (grade) {
		case 10:
		case 9: System.out.println("您的成绩为优秀");break;
		case 8: System.out.println("您的成绩为良好");break;
		case 7:
		case 6: System.out.println("您的成绩为中等");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: System.out.println("您的成绩为差");break;
		default: System.out.println("成绩无效");
		}
	}
}
