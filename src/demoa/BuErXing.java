package demoa;

public class BuErXing {
	public static void main(String args[]) {
		// 布尔型表示逻辑的计算结果
		boolean flag = 10 > 2;
		System.out.println(flag);
		if (flag) {// if语句需要布尔条件
			System.out.println("Hello World!!");
		}
		// 在有些语言中没有提供有布尔型的数据，会使用数字
		// 描述布尔型，例如0表示false,非0表示true,但是java没有
		// 这样的概念（不兼容类型，int型无法转换为boolean）
	}
}
