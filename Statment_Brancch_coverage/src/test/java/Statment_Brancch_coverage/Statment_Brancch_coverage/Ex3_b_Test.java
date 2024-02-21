package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex3_b_Test {
	@Test
	public void x_bigger_then_y() {
		int x=4;
		int y=2;
		int expected_result = 5;
		int result = WeakClass.WeakMethod3(x, y);
		assertEquals(expected_result, result,0.001);
	}
	@Test
	(expected =java.lang.ArithmeticException.class ) public void both_are_zero() {
	   int x = 0;
	   int y = 0;
	   WeakClass.WeakMethod3(x,y);
	  
}

}
