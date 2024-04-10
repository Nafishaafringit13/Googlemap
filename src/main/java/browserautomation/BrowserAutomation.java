package browserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		WebElement searchBox = driver.findElement(By.id("searchboxinput"));
        searchBox.sendKeys("New York City");

        // Find the search button and click on it
        WebElement searchButton = driver.findElement(By.id("searchbox-searchbutton"));
        searchButton.click();
        Thread.sleep(5000);
       
        WebElement txt = driver.findElement(By.xpath("//span[text()='USA']"));
        String text = txt.getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.close();
	}
   
}
