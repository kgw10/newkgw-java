package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {

		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println( num );
		
		// �޼���κ��� �� ������ ���ϱ� ��� �޾Ƽ� ����ϱ�
		int ��� = rm.sum();
		System.out.println(���);
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ�!!
		String userName = rm.user();
		int age = 34;
		System.out.println(userName + " " + age);
		
		// ����(89), ����(78), ����(50) �� ������ ������ ���ϴ� �޼���
		// �� ������ ����� ���ϴ� �޼���
		// ������ ����� ����ϼ���
		
        int total = rm.tot(); // ���� ���
        int average = rm.avg(); // ��� ���
        
        System.out.println("���� : " + total);
        System.out.println("��� : " + average);
	}
	/*
	 
	 �ֻ��� ����
	 
	 j���ذ� s�����̰� ������ �Ѵ�. �ֻ����� �ϳ�, �����̴�.
	 �ֻ����� ���� ū ����� �̱��.
	 �ֻ��� �� ���ϴ� �޼���
	 
	 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
	 
	 
	 */

}

class ReturnMth{
	
    int tot() {
        int ���� = 89, ���� = 78, ���� = 50;
        int total = ���� + ���� + ����;
        return total;
    }
    
    int avg() {
        int ���� = 89, ���� = 78, ���� = 50;
        int average = (���� + ���� + ����) / 3;
        return average;
    }
	
	
	
	
	
    String user() {
        return "�̼���"; // �̸� ��ȯ
    }
	

	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}