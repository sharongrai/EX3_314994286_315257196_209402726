package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex4_a {
	@Test
	public void xANDy_bigger_then_z() {
		int x=1;
		int y=5;
		int z=2;
		int expected_result = 3;
		int result = WeakClass.WeakMethod4(x, y,z);
		assertEquals(expected_result, result,0.001);
	}
	@Test
	public void z_bigger_then_y() {
		int x=4;
		int y=0;
		int z=2;
		int expected_result = 2; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod4(x, y,z);
		assertEquals(expected_result, result,0.001);
}
	@Test
	public void z_bigger() {
		int x=-5;
		int y=6;
		int z=2;
		int expected_result = 0; // דוגמא לתוצאה שנרצה לקבל
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
