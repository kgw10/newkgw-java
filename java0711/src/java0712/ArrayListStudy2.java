package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> list =new ArrayList<>();
		
		list.add( new Asset("우리 은행", "1004-91-123455", "이순신", 3450000)  );
		list.add( new Asset("농협", "34-123-349393", "김유신", 513350) );
		list.add( new Asset("신한은행", "394-3412-2323", "박팽년", 891003) );
		list.add( new Asset("국민은행", "39-2384-19939", "최무선", 899900) );
		list.add( new Asset("우리은행", "1002-93-878888", "문익점", 28300) );
		list.add( new Asset("신한은행", "293-0123-1234", "이율곡", 98000) );
		list.add( new Asset("우리은행", "1006-23-123456", "김시민", 1920000) );
		list.add( new Asset("국민은행", "23-2555-29991", "이율곡", 932000) );
		
		System.out.println( list );

		// 문제 1. 우리 은행을 이용하는 사람들 정보만 출력
		// 문제 2. 잔액이 100만원 이상인 사람들 정보만 출력
		// 문제 3. 최무선이 우리 은행 계좌를 가지고 있는지 확인하고 없으면 우리은행 계좌 개설(1007-23-128954)
		
        System.out.println("우리 은행 이용자 리스트:");
        for (Asset asset : list) {
            if (asset.getBank().equals("우리은행")) {
                System.out.println(asset);
            }
        }
        
        
        System.out.println("잔액 100만원 이상인 사람들 리스트:");
        for (Asset asset : list) {
            if (asset.getBalance() >= 1000000) {
                System.out.println(asset);
            }
        }
        
        
        boolean hasAccount = false;
        for (Asset asset : list) {
            if (asset.getHolder().equals("최무선") && asset.getBank().equals("우리은행")) {
                hasAccount = true;
                break;
            }
        }




	
	
	}

}
