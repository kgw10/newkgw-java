package java_thread3;

public class Money {
	private int myMoney = 10000;
	public int getMyMoney() {
		return myMoney;
	}
	// widhdraw �޼��带 �Ӱ� �������� ����
	public synchronized boolean widhdraw(int money) {
		if( myMoney >= money) {
			// ���� ���� �ݾ׺��� ��� �ݾ��� �۰ų� ���ٸ� ���
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			// ���
			myMoney -= money;
			return true;
		}
		
		return false;	// ��� ����(�� ����)
	}
}
