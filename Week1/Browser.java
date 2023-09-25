package HomeAssignment.Week1;

public class Browser {
	public void launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
 public static void main(String[] args) {
	 System.out.println("Method flow:");
	 Browser objname=new Browser();
	 objname.launchBrowser("Firefox");
	 objname.loadUrl();
}
}
