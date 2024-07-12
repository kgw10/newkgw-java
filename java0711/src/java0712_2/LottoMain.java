package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		int[] 일등 = new int[] {8, 12, 23, 29, 35, 41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자동 몇 장? : ");
		int howMany = scan.nextInt();
		
		for(int i = 1; i <= howMany; i++) {
			int[] temp = new int[6];
			for(int k = 0; k < temp.length; k++) {	// 6개 숫자 중복 없이
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
                for (int winNum : 일등) {
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

        System.out.println("3등 당첨 개수: " + count3rd);
        System.out.println("4등 당첨 개수: " + count4th);
				
		
		// 내가 구매한 로또 번호들 중 3등과 4등은 몇 개인가?
		// 3등은 5개의 숫자가 일치, 4등은 4개의 숫자가 일치
	}

}
