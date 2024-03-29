package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. 정수형 배열 10개를 선언
 * 2. 각 배열 요소에 임의의 난수 1 ~ 10까지의 값을 저장
 * 3. 키보드에서 1 ~ 10까지의 숫자를 입력 받기
 * 4. 배열에 값이 있는지 찾기
 * 5. 값이 있으면 몇 번째 위치인지 표시하시오
 */
public class Array_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Random rnd = new Random();
		int[] intNum = new int[10];

		for (int i = 0; i < intNum.length; i++) { //intNum.length는 배열의 개수(길이)만큼, 여기선 [10]이다.
			intNum[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1부터 10까지의 숫자 중에 값을 입력하세요 >> "); // 이 작업을 반복하고 싶다면 여기서부터 맨 아래까지 반복시키면 됨
		String strNum = scanner.nextLine();
		
		int intSearch = Integer.valueOf(strNum);
		int index;
		for (index = 1; index < intNum.length; index++) {
			if (intNum[index] == intSearch)
				break;
		}
		if (index >= intNum.length)
			System.out.printf("배열에 %d값이 없다\n", intSearch);
		else
			System.out.printf("찾았다.\t 배열의 %d번째에 값이 있다\n", index+1);
		
		
		for (int i = 0; i < intNum.length; i++) { // 랜덤으로 지정한 값들을 보여주는 코드
			System.out.print(intNum[i] + " ");
		}
	}

}
