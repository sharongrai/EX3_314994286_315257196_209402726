package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {

	public static int WeakMethod1(int x, int y) {
			if (x>y)
				x=x/y;
			else
				x=x+y;
			return x;	
	}
	
	public static int WeakMethod2(int a , int b ){
			if(a>0 && a!=b){
				return a/b; }
			else
				return a+b; 
	}
	
	public static int WeakMethod3(int x,int y) {
		if(x>y) {
			x=x*y;
		}
		if (x!=y) {
			x=x+y;
		}
		
		return x/y;
	}
	
	public static int WeakMethod4(int x , int y,int z) {
		if ((x+y)>z)
			z=(x+y)/z;
		else
			z=z/(x+y);
		return z;	
	}
	

}
