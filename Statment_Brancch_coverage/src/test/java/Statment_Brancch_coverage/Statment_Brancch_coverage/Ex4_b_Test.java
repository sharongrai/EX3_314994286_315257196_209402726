package Statment_Brancch_coverage.Statment_Brancch_coverage;


import org.junit.Test;

public class Ex4_b_Test {
	@Test
	(expected =java.lang.ArithmeticException.class ) public void z_is_zero() {
	   int x = 6;
	   int y = 4;
	   int z=0;
	   WeakClass.WeakMethod4(x,y,z);
	}	
}
