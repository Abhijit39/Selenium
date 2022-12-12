package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test1 {

	public static void main(String[] args) {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=c214794999297610f76c69a5c625d512");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	

	}

}
