import ex1.ChromeDriver;
import ex1.WebDriver;

public class ex1 {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			System.out.println (driver.findElement(By.tagName(“title”)).getText())

	}}
	}

}
