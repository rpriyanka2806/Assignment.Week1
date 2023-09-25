package HomeAssignment.Week1;

public class Fibonacciseries {

	public static void main(String[] args) {
		System.out.println("Fibonacciseries is:");
		int n = 8;
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for( int i=2; i<8; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
		// TODO Auto-generated method stub

	}

}
