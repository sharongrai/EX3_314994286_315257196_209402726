package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex2_b {
	@Test
	public void b_is_negative() {
		int a = 6;
		int b = -1;
		int expected_result = -6; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(a,b);
		   assertEquals(expected_result, result,0.001);	  
}
	@Test
	public void a_is_negative() {
		int a = -1;
		int b = 5;
		int expected_result = 4; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(a,b);
		   assertEquals(expected_result, result,0.001);	  
}
	@Test
	public void a_aquals_b() {
		int a = 5;
		int b = 5;
		int expected_result = 10; // דוגמא לתוצאה שנרצה לקבל
		int result = WeakClass.WeakMethod2(a,b);
		   assertEquals(expected_result, result,0.001);	  
}
}
