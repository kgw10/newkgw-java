package java0702_2;

public class javaMethod {

	public static void main(String[] args) {
		// Ŭ���� �޼��忡���� ���� Ŭ���� ������ Ŭ���� �޼��常 ���� - �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ�����
		// ���� �̷������ ������ �ν��Ͻ� ������ �ν��Ͻ� �޼���� �ȵȴ�.
//		javaMethod ja = new javaMethod;
//		ja.output();
		
		int num = 300;
		output( num );

		

	}
	
	static void output( int a ) {
		System.out.println( a );
		System.out.println(" ���� �޼��� �Դϴ�.");
	}

}




class a{
	int num = 10;
	
	static void out() {
		System.out.println( num );
	}
}
// main �޼��� -> JVM


// �ڹ� �޼���
// ��ȯŸ�� �޼��� �̸�(�Ű� ����){    }

// ��ȯŸ�� - int, short, float, double, char, boolean, void, String
// ��ȯŸ���̶� �޼����� return ������ Ÿ��
// return 10; -> ��ȯŸ�� int, short, long
// return income; -> income ������ Ÿ���� ��ȯŸ������

// void Ÿ���� ��ȯ���� ���ٶ�� �ǹ�

/*
 	�ֹε�Ϲ�ȣ�� �������� �������� ����
 	String gender(String jumin){
 		String gen = jumin.substring(7, 8);
 		iff(gen.equals("1") || gen.equals("3")){
 			return "����"
 		}else if(gen.equeals("2") || gen.equals("4") ) {
 			return "����";
 		}
 		return "ȥ��";
 		
 	}
 
 */
 