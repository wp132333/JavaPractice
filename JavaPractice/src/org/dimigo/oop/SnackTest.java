/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int add = 0;
		Snack[] snack = new Snack[]{
			new Snack("새우깡","농심",1100,2),
			new Snack("콘칲","크라운",1200,1),
			new Snack("허니버터칩","해태",1500,4)
		};
		for(int i=0; i<3; i++){
			snack[i].printSnack();
			System.out.println();
		}
		for(int i=0; i<3; i++){
			add += snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d",add) + "원" );
		
		
		

	}

}
