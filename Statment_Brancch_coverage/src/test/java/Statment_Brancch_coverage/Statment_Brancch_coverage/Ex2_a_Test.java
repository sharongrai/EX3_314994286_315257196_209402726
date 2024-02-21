package Statment_Brancch_coverage.Statment_Brancch_coverage;


import org.junit.Test;

public class Ex2_a_Test {
	@Test
	(expected =java.lang.ArithmeticException.class ) public void b_is_zero() {
	   int x = 6;
	   int y = 0;
	   WeakClass.WeakMethod2(x,y);
	//הזריקת חריגה אמורה להיות לפני השם של המתודה	  
}
	
	}
