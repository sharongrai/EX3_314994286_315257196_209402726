package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex1_b_Test {
	@Test
	public void x_bigger_then_y() {
			int x=6;
			int y=2;
			int expected_result = 3;
			int result = WeakClass.WeakMethod1(x, y);
			assertEquals(expected_result, result,0.001);
		}
	@Test
	public void y_bigger_then_x() {
			int x=2;
			int y=6;
			int expected_result = 8; // דוגמא לתוצאה שנרצה לקבל
			int result = WeakClass.WeakMethod1(x, y);
			assertEquals(expected_result, result,0.001);
	}
}
