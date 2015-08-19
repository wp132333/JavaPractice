/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Figure
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	
	Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected double calcArea() {
		return 0;
	}
	protected void printCenter(){
		System.out.println("중심좌표 : " + "(" + this.centerX + "," + this.centerY + ")");
	}
	protected void moveFigure(int x, int y) {
		this.centerX= centerX + x;
		this.centerY= centerY + y;
	}

}	
