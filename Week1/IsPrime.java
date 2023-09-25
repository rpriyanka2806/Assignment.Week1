package HomeAssignment.Week1;

public class IsPrime {

	public static void main(String[] args) {
		//Not prime
		System.out.println("Give numbers is:");
		int n=10;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
          System.out.println(n + " = " + "Not a prime number");	
          break;
			
				}else
					
			System.out.println(n + " = " + "Prime Number");
			break;
		}
		
		
		// TODO Auto-generated method stub

	}

}
