
public class CreateString0501 { //创建类

	public static void main(String[] args) {	//主方法
		//分别采用不同方式创建字符串对象/进行字符串的连接操作
		String a = "a数组为直接赋值的。";//直接赋值
		String b = new String("b数组为new构造方法赋值的。");//构造方法赋值
		char char_c[] = {'c','数','组','为','字','符','数','组','创','建','的','。'};
		String c = new String(char_c);
		char char_d[] = {'d','数','组','为','字','符','数','组','的','一','部','分','组','创','建','的','。','d','数','组','为','字','符','数','组','的','一','部','分','组','创','建','的','。'};
		String d = new String(char_d,0,17);//!!!!!!数组的索引编号从0开始计算，所以从0 开始
		System.out.println(a);//输出检查是否正确
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//连接字符串
		String e = a + b ;   // +
		String f = a;        // +=
		f+=b;
		String g = a;        // String.concat()
		g.concat(b);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		//连接其他数据类型
		double workTime1 = 3.5; //利用+连接其他数据类型的数据
		double workTime2 = 3.5;
		double workTime3 = 4.0;
		String h = "我们实验室早上工作"+workTime1+"小时，"+
		"下午工作"+workTime2+"小时，"+"晚上工作"+workTime3+"小时。";//不能直接分成两行，在加号处换行
		System.out.println(h);
		//提取字符串信息
		int size_h = h.length();	//提取字符串长度
		char chr_h4=h.charAt(4);	//提取指定位置的字符
		int index_workTime1 = h.indexOf("3.5");	//提取子字符串索引位置，indexOf()从前往后，首次出现的位置
		int index_workTime2 = h.lastIndexOf("3.5");	//提取子字符串索引位置，lastIndexOf()从后往前，最后一次出现的位置
		int index_workTime4 = h.lastIndexOf("3.8");	//找不到则返回-1
		int index_workTime12 = h.indexOf("3.5",17);	//从指定位置开始检索
		System.out.println(size_h);
		System.out.println(chr_h4);
		System.out.println(index_workTime1);
		System.out.println(index_workTime2);
		System.out.println(index_workTime4);
		System.out.println(index_workTime12);
		//首尾判断
		boolean h_beginning = h.startsWith("我");
		boolean h_ending = h.endsWith("。");
		if(h_beginning) {
			System.out.println("h字符串是以\"我\"开始的");
		}
		if(h_ending) {
			System.out.println("h字符串是以\"。\"结尾的");
		}
		//将字符串转换为字符数组
		char[] char_h = h.toCharArray();
		for (int i = 0; i < char_h.length; i++) {
			System.out.println("数组第"+i+"个元素为："+char_h[i]+"。");//输出数组的元素
		}
		//综合应用，输出一句古诗的后半句
		String j = "问渠那得清如许，为有源头活水来。";
		int indexComma = j.indexOf("，");       //获取最后一句话的位置
		int indexPeriod = j.lastIndexOf("。");
		String j_latter = j.substring(indexComma+1, indexPeriod); //截取后半句
		System.out.println("后半句是："+ j_latter);//输出显示
		//教材中未提到字符串变量是否支持数组，所以我试了一下
		String[] stringArray= {"shuoj","sfagffadf","桃子","我喜欢","齐天大圣"};
		int stringArrayLength = stringArray.length;
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}  //另外还有一个重要的发现……Java里的循环变量居然循环结束后就无效了，这个很方便啊，下次循环可以再用同一个变量名
	}

}
