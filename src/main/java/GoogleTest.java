import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		Screen s = new Screen();
		
		Pattern googleSearch = new Pattern("googlesearch");
		s.wait(googleSearch, 2000);
		s.click();
		
		Pattern signIn = new Pattern("signin");
		s.wait(signIn, 2000);
		s.click();
		
	}

}
