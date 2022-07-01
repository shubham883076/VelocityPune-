package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class study2 {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(100);
		
		driver.switchTo().frame("frame1");
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
	    driver.switchTo().frame(frame2);
	    WebElement txt2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(txt2.getText());
		Thread.sleep(100);
		
		driver.switchTo().parentFrame();
		
		WebElement txt1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(txt1.getText());
		Thread.sleep(100);
		
		driver.switchTo().parentFrame();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]"));
    	System.out.println(text.getText());		
		
	}
}
