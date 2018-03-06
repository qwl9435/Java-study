import java.util.Scanner;
public class simpleCalculator0601 {//简单计算器
	private static Scanner in; //输入变量
	public static void main(String[] args) {
		//创建simpleCalculator0601对象
		simpleCalculator0601 simpleCalculator0601 = new simpleCalculator0601();
		//输入计算参数——属性
		in = new Scanner(System.in);
		System.out.println("请输入参与计算的第一个数");
		double x = in.nextDouble(); //创建变量，第一个数x
		System.out.println("请输入参与计算的第二个数");
		double y = in.nextDouble(); //创建变量，第一个数y
		//输出运算结果
		System.out.println("相加："+ simpleCalculator0601.add(x, y));
		System.out.println("相减："+ simpleCalculator0601.less(x, y));
		System.out.println("相乘："+ simpleCalculator0601.multiplication(x, y));
		System.out.println("相除："+ simpleCalculator0601.division(x, y));
		System.out.println("实参x的值："+ x); 
		System.out.println("累加10+20+30+40："+ simpleCalculator0601.multiadd(10, 20, 30, 40));
		/*
		 * 以引用参数实现，以进行对比，效果是使用该方法后，原引用类型的值会被修改
		 */
		System.out.println("以下用引用参数方式实现");
		double variables[] = new double[2]; 
		in = new Scanner(System.in);
		System.out.println("第一个数");
		variables[0] = in.nextDouble(); //创建变量，第一个数x
		System.out.println("第二个数");
		variables[1] = in.nextDouble(); //创建变量，第一个数y
		simpleCalculator0601.clear(variables);
		System.out.println("清零：实参x1的值："+ variables[0]+"实参x2的值："+ variables[1]); 
	}
	//计算器可实现的行为———创建方法
	//方法的输入变量这里是形参
	private double add(double x, double y) {	//创建加法方法
		x=x+y;
		return x;
	} 
	
	private double less(double x, double y) {	//创建减法方法
		x=x-y;
		return x;
	} 	
	
	private double multiplication(double x, double y) {	//创建乘法方法
		x=x*y;
		return x;
	} 
	
	private double division(double x, double y) {	//创建除法方法
		x=x/y;
		return x;
	} 
	//不定长变量的使用，语法是参数类型后感叹号，只能在该方法所有参数最后面
	private double multiadd(double... x) {	//创建加法方法
		double result = 0;
		for (int i = 0; i < x.length; i++) {//for循环遍历所有参数
			result += x[i];		//说明实质是转化为了数组变量
		}
		return result;
	} 
	//定义一个方法，方法的参数为一维数组
	private void clear(double [] x) {	//创建加法方法
		x[0] = 0;
		x[1] = 0;
	} 
}
