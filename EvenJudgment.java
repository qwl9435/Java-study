
public class EvenJudgment {
//判断一个数是否为偶数
	public static void main(String[] args) {
	int inpuContant = 57;	// TODO Auto-generated method stub
	int remainder = 0;
	remainder = inpuContant % 2;
	//用条件语句实现判断
	if (remainder == 0) {
		System.out.println("该常数为偶数");
	} else {
		System.out.println("该常数为奇数");
	}
	//用三元运算符实现判断
	System.out.println(remainder == 0?("该常数为偶数"):("该常数为奇数"));
	}

}
