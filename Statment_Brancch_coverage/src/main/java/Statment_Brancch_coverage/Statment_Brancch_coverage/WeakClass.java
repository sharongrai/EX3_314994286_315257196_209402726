package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {

	//public static int WeakMethod1(int a, int b) {
		//דוגמא לפונקציה לשנות אחרי זה בהתאם לתרגיל
		//int c;
		//if(a<b)
		//	c=b;
		//else if(a>b)
		//	c=a;
		//else
		//	c=0;
		//return c;	
	//}
	public static int WeakMethod1(int x, int y) {
			if (x>y)
				x=x/y;
			else
				x=x+y;
			return x;	
	}
	
	public static int WeakMethod2(int a , int b ){
		int x;
			if(a>0 && a!=b){
				x=a/b; }
			else
				x=a+b;
			return x; 
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
