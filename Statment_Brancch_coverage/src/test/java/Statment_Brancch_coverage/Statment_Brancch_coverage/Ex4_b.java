package Statment_Brancch_coverage.Statment_Brancch_coverage;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex4_b {
	@Test
	public void y_bigger_z() {
	   int x = -6;
	   int y = 4;
	   int z=2;
	   int expected_result = -1; // דוגמא לתוצאה שנרצה לקבל
	   int result = WeakClass.WeakMethod4(x, y,z);
		assertEquals(expected_result, result,0.001);
	}
	@Test
	(expected =java.lang.ArithmeticException.class ) public void z_is_zero() {
	   int x = 6;
	   int y = 4;
	   int z=0;
	   WeakClass.WeakMethod4(x,y,z);
	}	
	
}
