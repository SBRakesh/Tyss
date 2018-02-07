package grid.demos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		URL url = new URL("http://192.168.43.242:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setVersion("57");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("http://www.facebook.com");
		
		
	}
}
