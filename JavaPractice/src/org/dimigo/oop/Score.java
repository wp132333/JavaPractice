/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor;
		int mat;
		int eng;
		StringBuilder sb = new StringBuilder();
		System.out.println("국어점수 입력 => ");
		kor = scanner.nextInt();
		System.out.println("수학점수 입력 => ");
		mat = scanner.nextInt();
		System.out.println("영어점수 입력 => ");
		eng = scanner.nextInt();
		System.out.println();
		System.out.println();
		System.out.println();
		sb.append("<< 점수 출력 >>\n")
		.append("국어점수 출력 => ")
		.append(kor)
		.append("점\n")
		.append("수학점수 출력 => ")
		.append(mat)
		.append("점\n")
		.append("영어점수 출력 => ")
		.append(eng)
		.append("점\n")
		.append("총점 출력 => ")
		.append(kor+mat+eng)
		.append("점\n")
		.append("평균 출력 => ")
		.append(String.format("%.1f", (kor+mat+eng)/3.0))
		.append("점\n").toString();
		System.out.println(sb);
		scanner.close();
		
		
	}

}
