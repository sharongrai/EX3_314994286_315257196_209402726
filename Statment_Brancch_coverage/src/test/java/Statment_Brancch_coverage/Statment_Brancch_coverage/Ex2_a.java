package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Ex2_a {
	@Test
	(expected =java.lang.ArithmeticException.class ) public void b_is_zero() {
	   int x = 6;
	   int y = 0;
	   int expected = WeakClass.WeakMethod2(x, y);
	   int result = WeakClass.WeakMethod2(x,y);
	   assertEquals(result, expected,0.001);
	//הזריקת חריגה אמורה להיות לפני השם של המתודה	  
}
	
	}
