package java0718_2;

public class DaemonTh extends Thread {
	
	@Override
	public void run() {
		System.out.println("���� ������ ����");
		while(true) {
			System.out.println("�ڵ� ����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/*
	
	���� ������
	�� �����带 �����ϴ� ������
	�� �����尡 ����Ǹ� ���� �����嵵 ����ȴ�.
	
	�� ������� ���� ��� �ؾ� ������ ���� ������� �� �������� ������ �ޱ� ������ ������ ��� ���� �ʾƵ� �ȴ�.




*/