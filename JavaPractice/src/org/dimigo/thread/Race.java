/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		Runner r1 = new Runner("A");
		Runner r2 = new Runner("B");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();

	}



}
