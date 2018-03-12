import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDriver ddrive=new MobileDriver();
		System.setProperty("webdriver.gecko.driver", "C://Users/sarath/Desktop/Savitha/SelJar/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		List <WebElement> element=driver.findElements(By.tagName("a"));
		for(int i=0;i<element.size();i++){
			String linktext=element.get(i).getText();
			String link=element.get(i).getAttribute("href");
			if(link.contains("https")){
				System.out.println(linktext +" is secure");
			} else {
				System.out.println(linktext +" is not secure");
			}
		}
		
		driver.findElementByCssSelector("input[type='email']").sendKeys("sabi.sadasivan@gmail.com");
		driver.findElementByXPath("//*[@id='identifierNext']/content/span").click();
		driver.findElementByCssSelector("input[type='password']").sendKeys("nmgtest123~");
		
		//driver.quit();
	
		
	}


}
