package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex2_b {
	@Test
	public void x_plus_y_bigger() {
		int x = 8;
		int y = 4;
		int expected_result =2 ; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(x,y);
		   assertEquals(expected_result, result,0.001);	  
}
	@Test
	public void x_plus_y_smaller() {
		int x = 6;
		int y = 3;
		int expected_result = 2; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(x,y);
		   assertEquals(expected_result, result,0.001);	  
}
	@Test
	public void x_aquals_y_smaller() {
		int x = 4;
		int y = 4;
		int expected_result = 8; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(x,y);
		   assertEquals(expected_result, result,0.001);	  
}
	@Test
	public void x_aquals_y_bigger() {
		int x = 6;
		int y = 6;
		int expected_result = 1; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(x,y);
		   assertEquals(expected_result, result,0.001);	  
}
}
