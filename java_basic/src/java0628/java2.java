package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class java2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		// name 배열의 문자열 중에서 이성계, 문익점, 정도전, 최영을 선발대 배열에 저장하고 출력하세요.
		String[] name = new String[] {
				"이순신", "김유신", "장보고", "이성계", "문익점", "정도전", "최영", "양만춘"
		};
		
		String[] 선발대 = new String[4];
		System.arraycopy( name,3, 선발대, 0, 4);
		System.out.println(Arrays.toString(선발대));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 6명의 키를 tall 배열에 저장하였다.
		// 키 175 미만을 출력하세요
//		float[] tall = new float[] { 173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		
//		for(float i = 0; i < tall.length; i++) {
//			if(tall[i] < 175) {
//				System.out.println(tall[i]);
//			}
//			
//		
		
		
		// 과자 배열에 좋아하는 과자의 판매 가격을 키보드로 입력하여 저장하세요.
		// 과자 배열에 저장된 판매가격들의 총합과 평균을 구하세요.
//		int[] 과자 = new int[5];
//
//		for(int i = 0; i < 과자.length; i++) {
//			System.out.println("과자 " + (i + 1) + "가격 : ");
//			과자[i] = scan.nextInt();
//		}
//		int total = 0, avg = 0; 	// 총합과 평균
//		for(int i = 0; i < 과자.length; i++) {
//			total = total + 과자[i];
//			
//		}
//		avg = total/과자.length;
//		
//		System.out.println("총합 : " + total + " 평균 : " + avg);
		
		
		
	}

}
