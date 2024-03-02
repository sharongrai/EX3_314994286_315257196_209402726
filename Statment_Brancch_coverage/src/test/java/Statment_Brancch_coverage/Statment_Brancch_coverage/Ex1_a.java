package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;


public class Ex1_a {
	@Test
	(expected =java.lang.ArithmeticException.class ) public void y_is_zero() {
	    int x = 2;
	    int y = 0;
	   WeakClass.WeakMethod1(x, y);
	//הזריקת חריגה אמורה להיות לפני השם של המתודה	  
}	
	}
	

