package demoa;

public class FuDian {
//����С�����������ͣ�Ĭ�ϵ�����������double
	public static void main(String[] args) {
		double num = 10.2;// 10.2��double����
		System.out.println(num * 2); // �ȼ���num * 2.0
		// num��double���� * 2��int�ͳ��� = double����

		// ׸������Χ����������ͺͷ�ΧС���������ͽ������ݼ���ʱ��
		// ���ݷ�ΧС�����ͻ��Ϊ���ݷ�Χ������ͣ�ͳһ�����������ݴ������

		// double���Ա�������������ģ�floatҲ��������С������ΧС��double,�������Ҫ
		// ��ֱ������float��������ô��Ҫ���ڶ����ʱ�����ǿ��ת���������ֺ��һ����ĸ"f""F"(��������ǰ��)

		// ���磺float f1 = 1.1 ; �ᱨ��-�����ݵ����ͣ���ʾǿ������ת����������ʾ������ʧ

		// java��ͳbug
		System.out.println(1.1 * 1.1);// ���������˺ö�0

		// ���εļ�������
		int numA = 10;
		int numB = 4;
		System.out.println(numA / numB);// �����2�����ȶ�ʧ��
		// ԭ��:int�� �� int�� = int��
		// �����Ҫ��ȷ���㣬��ô�ͱ��뱣֤��һ������������double�ͻ�float��
		System.out.println(numA / (double) numB);
		System.out.println((float) numA / numB);
		// ��������������ʱһ��Ҫ���������
		
		// ���������������С��λҲ���м��޵�
		System.out.println(10.0 / 3.0);
		System.out.println(10.0F / 3.0F);
	}
}
