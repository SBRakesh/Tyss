package grid.demos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {

	public static void main(String[] args) throws MalformedURLException 
	{
		URL url = new URL("http://10.3.0.1:4444/wd/hub/");
		DesiredCapabilities v = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(url, v);
	}

}
