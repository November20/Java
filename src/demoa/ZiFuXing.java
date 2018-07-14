package demoa;
//浅谈：开发中会使用到字符型的概念，但是真正去操作字符型的情况并不多
//字符型使用char表示，而且使用单引号来声明字符型的字符变量的内容，
//同时字符型可以与int互相转换
public class ZiFuXing {
	public static void main(String[] args) {
		char c = 'A'; //定义了字符
		System.out.println(c+"\n");
		//在整个字符型的处理之中，最麻烦的部分在于其可以与整形（int）互相转换
		//所有的字符在程序之中都是通过编码描述的，所以char变量变为int内容
		//的时候其所包含的就是编码
		System.out.println("char变为int的内容：");
		int num = c ;
		System.out.println(num+"\n");
		//常用范围：大写字母（A~Z）：65~90
		//        小写字母（a~z）：97~122
		//大写字母和小写字母之间差了32个长度
		//字符数字'0'~'9':48~57
		
		System.out.println("实现大写字母变小写字母：");
		int num1 = c + 32 ;
		//c是字符变量（变为int型）+int常量=int类型
		//将int型的内容强制转换为char类型
		char x = (char)num1;
		System.out.println(x+"\n");
		
		//Java使用的是UNICODE编码，这种编码包含有ASCII码的部分内容，但是它所包含的编码又多于ASCII码
		//同时UNICODE使用十六进制编码，这个编码可以保持任何的文字信息，包括中文（类名、变量名都可以用中文）
		System.out.println("趣味测试：");
		char 王 = '王';
		int 玖 = 王 +32;
		王 = (char)玖;
		System.out.println(王);
	}
}
