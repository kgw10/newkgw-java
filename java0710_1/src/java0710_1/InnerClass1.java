//package java0710_1;
//
//import java.util.Scanner;
//
//public class InnerClass1 {
//
//	public static void main(String[] args) {
//		Out out = new Out();
//		out.num = 100;
//		out.obj.age = 34;
//		out.obj.setName("�̼���");
//		
//		Out.�ν��Ͻ�����Ŭ���� in =  out.new �ν��Ͻ�����Ŭ����();
//		in.age = 20;
//		in.setName("������");
//	}
//
//}
//// static���� ���� �� ������ ������ �޼���� �ν��Ͻ� �޼��忡�� ��� ����
//// �ν��Ͻ� ����, �޼���� static �޼��忡�� ��� �Ұ�
//
//
//class Out{
//	static int count; 	// Ŭ���� ����
//	int num; 	// �ν��Ͻ� ����
//	private String job;	// �ν��Ͻ� ����
//	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();
//	
//	interface Car{	// ���� �������̽�
//		void make();
//	}
//	void makeCar() {
//		Car c = new Car() {
//			@Override
//			public void make() {
//				System.out.println(" �͸� ")
//			}
//		};
//		
//	}
//	
//	
//	
//	void buySomputter() {
//		
//		class ����Ŭ����{
//			static int weigth;
//			void del() {
//				
//			}
//		}	
//		����Ŭ���� ob = new ����Ŭ����();
//	}
//
//	
//	
//	static class ����Ŭ����{	// Out Ŭ���� ��ü�� ������ �ʴ´�.
//		static int birth;
//		static void update() {
//		}
//	}
//	private class �ν��Ͻ�����Ŭ���� {
//		public int age;
//		private String name;
//		void setName(String name) {
//			this.name = name;
//		}
//		static void create() {
//			count = 10;
//		}
//	}
//}