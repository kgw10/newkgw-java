//package homeProduct;
//
//public class Tv extends House {
//	
//	public int channel =10; //ä��
//	public int vol=5; // �Ҹ�
//	
//	Tv(){ // ������ �޼���
//		super();
//       	}
//	public int getChannel() {
//		return channel;
//	}
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//	public int getVol() {
//		return vol;
//	}
//	public void setVol(int vol) {
//		this.vol = vol;
//	}
//	//�Ű����� �ִ� ������ �޼���
//	public Tv(String brand, int price){
//		super(brand, price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
//	}
//	
//	public void channelUp() {
//		this.channel++;
//	}
//	public void channelDown() {
//		this.channel--;
//	}
//	
//	
//	
//	@Override
//	void power() {
//		super.onOff = !super.onOff;
//		System.out.println("TV ���� : " + super.onOff);
//	}
//}
//// �����ε��� - ���ο� �޼��带 �����ϴ� ��
//// �������̵��� - ������ �޼��带 ������ �ϴ� ��
//
//
//// �������̵� ����
//// �θ� Ŭ������ �ش� �޼��尡 �����ؾ� �Ѵ�.
//// �������̵� �޼���� �ݵ�� ��ȯŸ��, �޼��� �̸�, �Ű����� ��� �Ȱ��� �ۼ��ؾ� �Ѵ�.
//// �޼����� {} ������ �޶� �ȴ�.