package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		//디미베네
		int mpay = 1700000;
		int member = 3;
		int nstore = 1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",mpay) + "원");
		System.out.println("점포 내 직원 수 : " + member + "명");
		System.out.println("점포 수 : "+ String.format("%,d",nstore) + "개\n\n");
		long ypay = (long)mpay * 12 * (long)member * (long)nstore;
		System.out.println("연간 인건비 : " + String.format("%,d", ypay) + "원");

	}

}
