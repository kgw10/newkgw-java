package java0711_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {

		// ���Ͽ� ����
		BufferedWriter br = null;
		try {
			br = new BufferedWriter( new FileWriter( "c:/test/data.txt" ) );
			String name = "�̼���";
			br.write("�̼��� 34 ����" + name.substring(10));
			br.close();
		}catch( Exception e ) {
			System.out.println("���� or ���Ⱑ �߸��� ����");
			
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}

// ���� ó�� - �ڵ��� ����ȯ
// ���� �б�, ���⸦ �Ϸ��� ������ ����� �Ѵ�.
// ������ ��� ����� �������� ���� �ڿ��� �ݳ��ؾ� �Ѵ�.
// ���� �ݱ⸦ ����� �Ѵ�.
// ������ ���̽��� �����͸� �����ϰų� �������� ������ �ߴٸ� �ݱ⸦ ����� �Ѵ�.