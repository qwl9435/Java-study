import java.io.IOException;

public class callCdegs1 {

	public static void main(String[] args) throws IOException {
			//String filePath ="E:\\CDEGS(64)\\zhuang\\Cdegs.exe";
			String cmd ="E:\\CDEGS(64)\\zhuang\\Cdegs.exe";
			java.lang.Runtime.getRuntime().exec(cmd);
			/*
			 以目前对CDEGS直流偏磁仿真的了解，参数化建模的参数输入其实是EXCEL表格复制粘贴到参数输入界面
			 这样肯定不可能用java程序实现，所以要么就是不分操作在人工在CDEGS里进行，要么就是对CDEGS的运行方法
			 做深入研究
			 */
	}

}
