package homeProduct;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {

		
		Tv tv = new Tv();
		tv.brand = "�Ｚ";
		tv.power();
		tv.power();
		
		Aircon air = new Aircon();
		
		air.brand = "LG�ּ�";
		System.out.println(air.brand);
		air.power();
		air.power();

	}

}


// Ŭ���� ���
// ����Ϸ��� �ڽ� Ŭ���� �̸� �ڿ� extends �θ� Ŭ���� �̸�
// extends - Ȯ��, ����..
// Tv extends House -> Tv Ŭ������ �ڽ��̰� House�� �θ� Ŭ�����̴�.
// ����� �ϴ� ���� ū ���� - ���⼺
// �θ� Ŭ������ �ν��Ͻ� ����, �ν��� �޼���, Ŭ���� ����, Ŭ���� �޼��� ��� �����ϴ�.
// ��, �θ� Ŭ������ ��� �� ��������� ���Ѵ�.
// �Ϻ� ���� �ɷ��ִ� ������ �޼���� ��� �Ұ�
// ������ �޼��带 ���� �ν��Ͻ� �������� �ʱ�ȭ�� �ڽ� Ŭ������ ������ �ִ� ������ �ڽ� Ŭ���� ������ �޼��忡�� �ʱ�ȭ
// �θ� Ŭ������ ������ �ִ� ������ �θ� Ŭ���� ������ �޼��忡�� �ʱ�ȭ







