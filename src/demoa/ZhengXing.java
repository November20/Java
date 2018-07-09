package demoa;

public class ZhengXing {
	public static void main(String[] args) {
		// 在java程序里任何一个整数的常量类型都是int型

		// ------------------------------------------

		int num = 10;// 声明一个整形变量
		// 10是一个整数（不会被改变的数据是常量）
		// 程序之中任何一个整数对应的类型都是int
		//

		// ------------------------------------------

		System.out.println(num * 2);
		System.out.println("---------------------");
		// num是int型的变量*2是int型的常量=int型

		// ==========================================

		// 整形数据溢出操作
		// 变量的命名要求：第一个单词的字母小写，而后每个单词的首字母大写
		int maxValue = Integer.MAX_VALUE;// 取得最大值
		int minValue = Integer.MIN_VALUE;// 取得最小值
		System.out.println("int型的最大值和最小值：");
		System.out.println(maxValue);
		System.out.println(minValue);
		System.out.println("·············");
		System.out.println("最大值+1变成最小值：");// 数据溢出
		System.out.println(maxValue + 41);
		// int型变量+int型常量=int型
		System.out.println("·············");
		System.out.println("最小值-1变成最大值：");// 数据溢出
		System.out.println(minValue - 1);

		// 在操作前要预估数据大小
		System.out.println("");
		System.out.println("改用long类型,解决整形数据溢出");
		long result = maxValue + 1;// 此时依然溢出
		System.out.println(result);

		// 所有的程序执行顺序都是由等号的右边到左边
		// maxValue + 1 int型变量+int型常量=int型，已经是-2147483648，赋值给long也不会变化

		System.out.println("解决方法：将其中一个变量的类先做扩充");
		System.out.println("1、直接将int变量的内容赋值给long变量");
		long result1 = maxValue;
		System.out.println(result1 + 1);
		// result1是long类型+1是int类型 = long类型
		// .范围大的数据类型和范围小的数据类型进行数据计算时，
		// 数据范围小的类型会变为数据范围大的类型，统一后结果就是数据大的类型

		System.out.println("2、直接将某一个int型变量变为long型");

		long result2 = (long) maxValue + 1;
		System.out.println(result2);

		// 数据范围大的类型变为数据范围小的类型需要强制类型转换，强制会损失精度（丢内容）
		long num2 = 2147483648L;
		// 任何整数其默认类型都是int，但是2147483648已经超过了int可以保存的数据范围
		// 加L/l可以表示一个long型的常量，L比较好，防止和1混淆
		System.out.println("");
		System.out.println("强制类型转换：");
		int result3 = (int) num2;// 开发中尽量避免
		System.out.println(result3);
		System.out.println("---------------------------");
		// 之前说过所有的数据类型都有默认值，但是这个默认值在方法的声明中无效
		// int num3 ;此时输出num会报错（可能尚未初始化变量）
		// num3 = 10 ;在老版本的jdk里会出错
		// 最好的方法就是在变量声明的时候声明默认值 int num3 = 10 ;

		// byte数据类型可以保存的范围是-128~127，常用在二进制流和编码转换
		byte data = 20;// 20是int类型常量,int的数据范围大于byte，按理讲需要强制类型转换
						// 但是其数据量在byte范围内，所以没有强制类型转换
		System.out.println(data);
		byte data1 = (byte) 128;// 此时没有强转会报错（不兼容类型）
		System.out.println(data1);// 此时数据溢出，进入“循环”成最小值

		// 此时注意：如果想让int常量直接赋值给byte变量（数据量在byte范围内），那么只能够使常量，而不能是int变量
		// int num = 20 ；
		// byte data = num ； 此时没有强转会报错（不兼容类型）
		// System.out.println(data)；

	}
}
