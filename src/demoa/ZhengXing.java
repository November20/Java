package demoa;

public class ZhengXing {
	public static void main(String[] args) {
		// ��java�������κ�һ�������ĳ������Ͷ���int��

		// ------------------------------------------

		int num = 10;// ����һ�����α���
		// 10��һ�����������ᱻ�ı�������ǳ�����
		// ����֮���κ�һ��������Ӧ�����Ͷ���int

		// ------------------------------------------

		System.out.println(num * 2);
		System.out.println("---------------------");
		// num��int�͵ı���*2��int�͵ĳ���=int��

		// ==========================================

		// ���������������
		// ����������Ҫ�󣺵�һ�����ʵ���ĸСд������ÿ�����ʵ�����ĸ��д
		int maxValue = Integer.MAX_VALUE;// ȡ�����ֵ
		int minValue = Integer.MIN_VALUE;// ȡ����Сֵ
		System.out.println("int�͵����ֵ����Сֵ��");
		System.out.println(maxValue);
		System.out.println(minValue);
		System.out.println("��������������������������");
		System.out.println("���ֵ+1�����Сֵ��");// �������
		System.out.println(maxValue + 41);
		// int�ͱ���+int�ͳ���=int��
		System.out.println("��������������������������");
		System.out.println("��Сֵ-1������ֵ��");// �������
		System.out.println(minValue - 1);

		// �ڲ���ǰҪԤ�����ݴ�С
		System.out.println("");
		System.out.println("����long����,��������������");
		long result = maxValue + 1;// ��ʱ��Ȼ���
		System.out.println(result);

		// ���еĳ���ִ��˳�����ɵȺŵ��ұߵ����
		// maxValue + 1 int�ͱ���+int�ͳ���=int�ͣ��Ѿ���-2147483648����ֵ��longҲ����仯

		System.out.println("���������������һ������������������");
		System.out.println("1��ֱ�ӽ�int���������ݸ�ֵ��long����");
		long result1 = maxValue;
		System.out.println(result1 + 1);
		// result1��long����+1��int���� = long����
		// .��Χ����������ͺͷ�ΧС���������ͽ������ݼ���ʱ��
		// ���ݷ�ΧС�����ͻ��Ϊ���ݷ�Χ������ͣ�ͳһ�����������ݴ������

		System.out.println("2��ֱ�ӽ�ĳһ��int�ͱ�����Ϊlong��");

		long result2 = (long) maxValue + 1;
		System.out.println(result2);
		
		
		//���ݷ�Χ������ͱ�Ϊ���ݷ�ΧС��������Ҫǿ������ת����ǿ�ƻ���ʧ���ȣ������ݣ�
		long num2 = 2147483648L;
		//�κ�������Ĭ�����Ͷ���int�����Ǹ������Ѿ�������int���Ա�������ݷ�Χ
		System.out.println(num2);
	}
}
