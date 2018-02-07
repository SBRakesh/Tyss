package grid.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Parameters({"browser","version"})
	@Test
	public void runTest(String browser, String version) throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		dc.setVersion(version);
		dc.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("http://www.google.com");
	}
}
