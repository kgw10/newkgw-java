//package Service;
//
//import java.util.Scanner;
//unoirt DTO.coffe;
//
//public class SelectDrink implements kiosk {
//	
//	private HashMap<Integer, Coffe> coffe;
//	private HashMap<Integer, Tea> tea;
//	
//	@Override
//	public void action() {
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.println("1. Ŀ�� 2. Ƽ");
//		
//			int category = scan.nextInt();
//	
//			switch( category) {
//			case 0: System.out.println("������ ������"); return;
//			case 1: selectCoffe(); break;
//			case 2: selectTea(); break;
//			default:
//				System.out.println("�ٽ� �Է��ϼ���");
//			}
//		}	// while(true) ��ȣ end
//		
//	}
//}
