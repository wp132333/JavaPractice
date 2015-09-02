/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("iPhone6", "애플", 700000),
				new Galaxy("S6", "삼성", 650000)	
		};
		for(SmartPhone arr : s){
			System.out.println(arr.toString());
			arr.turnOn();
			arr.pay();
			arr.useSpecialFuction(arr);
			arr.turnOff();
		}
		
	}

}
