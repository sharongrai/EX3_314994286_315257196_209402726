package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Statment_Brancch_coverage.Statment_Brancch_coverage.WeakClass;

public class Ex4_a {
	@Test
	public void xANDy_bigger_then_z() {
		int x=1;
		int y=3;
		int z=2;
		int expected_result = 2;
		int result = WeakClass.WeakMethod4(x, y,z);
		assertEquals(expected_result, result,0.001);
	}
	@Test
	public void z_bigger_then_xANDy() {
		int x=1;
		int y=1;
		int z=6;
		int expected_result = 3; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod4(x, y,z);
		assertEquals(expected_result, result,0.001);
}

}
