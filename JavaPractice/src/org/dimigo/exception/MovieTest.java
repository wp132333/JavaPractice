/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ MovieTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author : CJM
 * @version : 1.0
 * 
 */
public class MovieTest {
	public static void main(String[] args) {
		try{
			Movie[] movies = {
					new Movie("엔트맨",12), new Movie("사도",12), new Movie("베테랑",15)
			};
			int age = 13;
			for(Movie movie : movies){
				buyTicket(movie,age); // 예외
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTicket(Movie movie, int age) throws Exception{
		if(age < movie.getLimitAge())
			throw new AgeCheckException(movie); // error
		else
			System.out.println(movie.getTitle()+" 잘봐");
	}

}
