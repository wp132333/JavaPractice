package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9, b = 10;
		double lh = 5.8;//사다리꼴
		double ph = 5.4;//평행사변형
		double lS;
		double pS;
		
		System.out.println("<< 도형 넓이 비교 >>");
		lS = (a + b)*lh/2;
		System.out.println("사다리꼴의 넓이 : " + lS);
		pS = a*ph;
		System.out.println("평행사변형의 넓이 : " + pS + "\n\n");
		if(lS>pS)
		{
			System.out.println("사다리꼴이 평행사변형 보다 " + (lS-pS) + " 더 큽니다.");
		}
		else if(lS == pS)
		{
			System.out.println("사다리꼴이 평행사변형과 같습니다.");
		}
		else
		{
			System.out.println("사다리꼴이 평행사변형 보다 " + (pS - lS) + " 더 작습니다.");
		}

	}

}
