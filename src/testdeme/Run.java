package testdeme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Run {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/oguzcan.ozkara/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		//açýlan sayfayý max size yap.
				System.out.println(driver.getTitle());
				
				
					Assert.assertTrue(driver.getTitle().contains("Google"));
		//Site isminin doðrulamasý yapýldý.
		
					
					System.out.println("Web Site Title is TRUE");
					
						
					//System.out.println("Web Site Title is FALSE");
					//try-catch ile yapmayý denedik
					
				WebElement element =driver.findElement(By.name("q"));
				//Arama kutusunun ismini aldýk
				
				
				element.sendKeys("Akçakoca");
				//Arama kýsmýna aranacak kelimeyi gönderdim.
				
			
				element.submit();
				//arama tuþuna basýldý.
				Thread.sleep(2000);
				//driver.quit();
				// otomatik kapatma
				
				
				
				
				
				
		
		
		}

	}


