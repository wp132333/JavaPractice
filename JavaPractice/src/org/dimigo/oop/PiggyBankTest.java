/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember a1 = new FamilyMember("아빠");
		FamilyMember a2 = new FamilyMember("엄마");
		FamilyMember a3 = new FamilyMember("나");
		FamilyMember a4 = new FamilyMember("남동생");
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(a1, 10000);
		PiggyBank.putMoney(a2, 1000);
		PiggyBank.putMoney(a3, 900);
		PiggyBank.putMoney(a4, 100);
		PiggyBank.printBalance();
		
		
		
		
		
		

	}

}
