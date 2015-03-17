package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean female = true;
		int age = 23;
		double h = 161.8d;
		float w = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		System.out.printf("성별 : ");
		if(female){
			System.out.println("여자");
		}
		else
		{
			System.out.println("남자");
		}
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : " + h + "cm");
		System.out.println("몸무게 : " + w + "kg");
		System.out.println("혈액형 : " + bloodtype + "형");
		
		
		
	
		

	}

}

