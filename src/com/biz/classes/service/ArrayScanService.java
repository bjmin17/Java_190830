package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {

	private int[] nums ;
	
	// 생성자 메서드 : 
	// 		클래스에 포함되는 method 중에
	// 		void 등이 없고
	// 		이름이 클래스 이름과 같은 method
	// 생성자 메서드는
	// 누군가 new ArrayScansService() 생성자 메서드를
	// 호출할 때 자동으로 호출되는 method이다.
	
	public ArrayScanService(int length) { //void랑 첫글자 대문자인게 다름,,, 메서드 이름이 클래스와 같음
		
		Random rnd = new Random();
		
		nums = new int[length]; // 메서드 괄호 안의 수만큼 배열을 만듦
		for(int i = 0 ; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
	}
	public void scanArray() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 ~ 10까지 정수 >> ");
		String strNum = scanner.nextLine();
		
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for(index = 0 ; index < nums.length ; index++) {
			if(nums[index] == intNum) break;
		}
		if(index >= nums.length)
			System.out.print("찾는 값이 없음!!!\n");
		else
			System.out.printf("%d번째에서 찾음\n", (index+1));
		
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		scanner.close(); // 키보드 연결을 끊는 것
		
	} // scanArray End
	
	public void scanArrayAll() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1 ~ 10까지의 정수 >> ");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		int nCount = 0; //index라 안하고 nCount라 하면서 0으로 초기화함
		for(int i = 0 ; i < nums.length ; i++) {
			
			if(nums[i] == intNum) {
				System.out.printf("%d 번째에 찾음!!\n", i+1); // 중간에 break가 없어서 원하는 모든 값을 찾게됨
				nCount ++;
			}
		}
		
		if(nCount < 1) {//1보다 작다는건 하나도 없다는걸 의미
			System.out.println("찾지 못함");
		} else {
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
			}
			System.out.println();
		}
		// scanner.close();
		
	}
}
