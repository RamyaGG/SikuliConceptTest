import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.google.common.io.PatternFilenameFilter;

/*Integration of Sikuli with Selenium WebDriver:

Now, no need to take the headache of XPath, CSS, ID and Name. 

+Sikuli is an image-based open source tool to automate the GUI and can be used on any platform like Windows/Linux/Mac/Mobile. 

+Sikuli uses a technique called image recognition to identify and control GUI components.

====================================================
• Automate using images
• No API to launch Browser and URL – need to use selenium
• Can automate flash objects – YouTube video
• Desktop application automation*/

//https://docs.seleniumhq.org/download/maven.jsp

public class YoutubeVideoTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=qvE2miLMbNk");
		
		//create the object of screen class -- sikuli
	
	    Screen s = new Screen();
	    Pattern pauseImg = new Pattern("Pause.PNG");
	    s.wait(pauseImg, 2000);
	    s.click();
	    
	    Pattern playImg = new Pattern("Play.PNG");
	    s.wait(playImg,2000);
	    s.click();
	    
	    Pattern settings = new Pattern("settings.PNG");
	    s.wait(settings, 2000);
	    s.click();
	    
	    Pattern auto_480 = new Pattern("auto_480p.PNG");
	    s.wait(auto_480, 2000);
	    s.click();
	    
	    Pattern p_720 = new Pattern("p_720.PNG");
	    s.wait(p_720,2000);
	    s.click();
	    
		
		
		
		

	}

}
