package findBrand;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Percentage {
	@Test

	public void sunGlass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/women-sunglasses");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> classes = driver.findElementsByXPath("//span[@class='product-discountPercentage']");// we are getting All the percentage 
		System.out.println(classes.size());

		int i = 1;
		for (WebElement eachClass : classes) {
			// System.out.println(eachClass.getText());
			Thread.sleep(2000);
			if (eachClass.getText().contains("(50% OFF)")) {
				System.out.println(driver
						.findElementByXPath(
								"(//span[@class='product-discountPercentage'])[" + i + "]/preceding::div[1]")// incrementinge the index number
						.getText());
			}
			i++;
		}

	}
}



