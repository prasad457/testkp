package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnviDetails 
{

	public void getSysProp()
	{
		WebDriver d = new FirefoxDriver();
		String user = System.getProperty("user.name");
		String os = System.getProperty("os.name");
		String dir = System.getProperty("user.dir");
		System.out.println("directory:"+dir);
		String version = System.getProperty("os.version");
		System.out.println("User: "+user+"\nOS: "+os+"\nversion: "+version);
		System.out.println("Browser: ");
			if(d instanceof FirefoxDriver )
			{
				System.out.println("FF");
			}
	}
	
	public static  void main( String args[]) 
	{
		EnviDetails e = new EnviDetails();
		e.getSysProp();

	}
}
