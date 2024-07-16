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
//			System.out.println("1. 커피 2. 티");
//		
//			int category = scan.nextInt();
//	
//			switch( category) {
//			case 0: System.out.println("다음에 만나요"); return;
//			case 1: selectCoffe(); break;
//			case 2: selectTea(); break;
//			default:
//				System.out.println("다시 입력하세요");
//			}
//		}	// while(true) 괄호 end
//		
//	}
//}
