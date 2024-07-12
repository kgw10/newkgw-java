package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> list =new ArrayList<>();
		
		list.add( new Asset("�츮 ����", "1004-91-123455", "�̼���", 3450000)  );
		list.add( new Asset("����", "34-123-349393", "������", 513350) );
		list.add( new Asset("��������", "394-3412-2323", "���س�", 891003) );
		list.add( new Asset("��������", "39-2384-19939", "�ֹ���", 899900) );
		list.add( new Asset("�츮����", "1002-93-878888", "������", 28300) );
		list.add( new Asset("��������", "293-0123-1234", "������", 98000) );
		list.add( new Asset("�츮����", "1006-23-123456", "��ù�", 1920000) );
		list.add( new Asset("��������", "23-2555-29991", "������", 932000) );
		
		System.out.println( list );

		// ���� 1. �츮 ������ �̿��ϴ� ����� ������ ���
		// ���� 2. �ܾ��� 100���� �̻��� ����� ������ ���
		// ���� 3. �ֹ����� �츮 ���� ���¸� ������ �ִ��� Ȯ���ϰ� ������ �츮���� ���� ����(1007-23-128954)
		
        System.out.println("�츮 ���� �̿��� ����Ʈ:");
        for (Asset asset : list) {
            if (asset.getBank().equals("�츮����")) {
                System.out.println(asset);
            }
        }
        
        
        System.out.println("�ܾ� 100���� �̻��� ����� ����Ʈ:");
        for (Asset asset : list) {
            if (asset.getBalance() >= 1000000) {
                System.out.println(asset);
            }
        }
        
        
        boolean hasAccount = false;
        for (Asset asset : list) {
            if (asset.getHolder().equals("�ֹ���") && asset.getBank().equals("�츮����")) {
                hasAccount = true;
                break;
            }
        }




	
	
	}

}
