public class GetDay0402 {
	public static void main(String[] args) {
		// 创建每个月的日期数组
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < 12; i++) { // 遍历数组的数据
			System.out.println((i + 1) + "月有" + day[i] + "天"); // 输出显示
		}
	}
}
