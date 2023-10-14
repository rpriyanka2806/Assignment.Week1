package HomeAssignment.week3;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class StringConcept {
	
	public static void Example1() {
		String str="Hello World";
		String[] split = str.split(" ");
		System.out.println("The last word is:" + " " + split[1] + " "+ "with length is:" + split[1].length());
		// TODO Auto-generated method stub
		
		System.out.println("********");
		
	}
	
	public void Example2() 
	    {
		String str2="fly me   to   the moon";
	    String replace = str2.replace("   " ," ");
	    String[] split2 =replace.split(" ");
	for(int i=0;i<split2.length;i++) {
		System.out.println(split2[i]);
		}
	System.out.println("The length of moon is:" + " " + split2[4].length());
	System.out.println("*****************");
		
	}
	
	public void Example3() 
	{
		String str3="luffy is still joyboy";
		String[] split3 = str3.split(" ");
		System.out.println("The last word is joyboy with length:" + " "+ split3[3].length());
		
	}

	public static void main(String[] args) 
	{
		
		Example1();
		StringConcept ex=new StringConcept();
		ex.Example2();
		ex.Example3();
        
		
	}

}
