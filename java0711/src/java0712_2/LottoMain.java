package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		int[] �ϵ� = new int[] {8, 12, 23, 29, 35, 41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ڵ� �� ��? : ");
		int howMany = scan.nextInt();
		
		for(int i = 1; i <= howMany; i++) {
			int[] temp = new int[6];
			for(int k = 0; k < temp.length; k++) {	// 6�� ���� �ߺ� ����
				temp[k] = (int)(Math.random()*45)+1;
				for(int j = 0; j < k; j++) {
					if(temp[k] == temp[j]) {
						k--; break;
					}
				}
			}
			list.add(new Lotto(temp));
			
		}
		list.forEach(lt -> System.out.println(lt));
		
        int count3rd = 0;
        int count4th = 0;

        for (Lotto lotto : list) {
            int matchCount = 0;
            for (int num : lotto.getNum()) {
                for (int winNum : �ϵ�) {
                    if (num == winNum) {
                        matchCount++;
                        break;
                    }
                }
            }

            if (matchCount == 5) {
                count3rd++;
            } else if (matchCount == 4) {
                count4th++;
            }
        }

        System.out.println("3�� ��÷ ����: " + count3rd);
        System.out.println("4�� ��÷ ����: " + count4th);
				
		
		// ���� ������ �ζ� ��ȣ�� �� 3��� 4���� �� ���ΰ�?
		// 3���� 5���� ���ڰ� ��ġ, 4���� 4���� ���ڰ� ��ġ
	}

}
