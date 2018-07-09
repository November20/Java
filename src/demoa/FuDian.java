package demoa;

public class FuDian {
//描述小数的数据类型，默认的数据类型是double
	public static void main(String[] args) {
		double num = 10.2;// 10.2是double类型
		System.out.println(num * 2); // 等价于num * 2.0
		// num是double类型 * 2是int型常量 = double类型

		// 赘述：范围大的数据类型和范围小的数据类型进行数据计算时，
		// 数据范围小的类型会变为数据范围大的类型，统一后结果就是数据大的类型

		// double可以保存的数字是最大的，float也可以描述小数，范围小于double,所以如果要
		// 想直接声明float变量，那么就要求在定义的时候进行强制转换，在数字后加一个字母"f""F"(或在数字前加)

		// 例如：float f1 = 1.1 ; 会报错-不兼容的类型，提示强制类型转换，并且提示精度损失

		// java传统bug
		System.out.println(1.1 * 1.1);// 结果后面多了好多0

		// 整形的计算问题
		int numA = 10;
		int numB = 4;
		System.out.println(numA / numB);// 结果是2（精度丢失）
		// 原因:int型 ÷ int型 = int型
		// 如果想要精确计算，那么就必须保证有一个类型至少是double型或float型
		System.out.println(numA / (double) numB);
		System.out.println((float) numA / numB);
		// 所以做除法计算时一定要计算好类型
		
		// 如果除不尽，保留小数位也是有极限的
		System.out.println(10.0 / 3.0);
		System.out.println(10.0F / 3.0F);
	}
}
