package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex3_a {
	@Test
	public void x_bigger_then_y(){
		int x=6;
		int y=2;
		int expected_result = 7;
		int result = WeakClass.WeakMethod3(x, y);
		assertEquals(expected_result, result,0.001);
	}

}
