package ch2;

/*
 * 연산자란?
 * 값을 계산하거나 비교할 때 사용하는 기호
 * 
 * */
public class Operation1 {

	public static void main(String[] args) {
		
		// 산술 연산자 : +, -, *, /, %
		int a = 10 + 5;
		int b = 10 - 5;
		int c = 6 * 3;
		int d = 9 / 4;
		int e = 9 % 4; // 나머지 값
		
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("=======");
		
		// 비교 연산자 : ==, !=, >, <, >=, <= 
		boolean isSame = 1 == 1; // 같다 t
		boolean isDiff = (4 != 9); // 같지 않다 t
		boolean isBig = 10 > 3; // 연산은 왼쪽이 기준 (크다) t
		boolean isSmall = 3 > 10; // 연산은 왼쪽이 기준 (작다) t
		boolean isLt = (4 >= 10); // 크거나 같다 f
		boolean isRt = (4 <= 4); // 작거나 같다 t
		
		System.out.println(isSame);
		System.out.println(isDiff);
		
		System.out.println("==============");
		
		//논리 연산자 : &&(AND), ||(OR), !(Not)
		boolean out1 = (5 > 2) && (10 > 20); // A조건 && B 조건 둘 다 만족 f
		boolean out2 = (5 > 2) || (10 > 20); // A조건 || B 조건 둘 중 하나 만족 t
		boolean out3 = !(5 > 2); // 결과 값의 반대 값 f
		
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
		System.out.println(!true);
		
	}

}
