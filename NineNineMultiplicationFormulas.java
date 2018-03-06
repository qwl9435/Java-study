
public class NineNineMultiplicationFormulas {
//输出九九乘法表
	public static void main(String[] args) {
	//以for循环实现	
	for (int i = 1; i < 10; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j+"×"+i+"="+i*j+"\t");
		}
		System.out.println();//换行
	} 
	System.out.println("\n以break语句实现相同效果:\n");//换行
	//以break语句实现相同效果
	OuterLoop : for (int i = 1;; i++) {
		InnerLoop: for (int j = 1; ; j++) {
			if (i>9) {
				break OuterLoop;
			} else if (j>i) {
				break InnerLoop;
			}
			System.out.print(j+"×"+i+"="+i*j+"\t");
		}
		System.out.println();//换行
	} 
	}

}
