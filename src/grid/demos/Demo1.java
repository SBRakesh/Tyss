package grid.demos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 
{
	public static void main(String[] args) 
	{
		DesiredCapabilities v = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(v);
		driver.close();
	}
}
