package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altius\\eclipse-workspace\\Jan2\\driver\\chromedriver.exe");
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		//Go to the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the Browser
		driver.manage().window().maximize();
		//To get the Title
		String title = driver.getTitle();
		System.out.println(title);
		//To get the Current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		//TextUsername
//		WebElement textUsername = driver.findElement(By.xpath("//input[@id='email']"));
//		textUsername.sendKeys("Gokul");
//		//TextPassword
//		WebElement textPassword = driver.findElement(By.xpath("//input[@id='pass']"));
//		textPassword.sendKeys("Loganathan");
//		//btnLogin
//		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
//		btnLogin.click();
		
//		//Navigate
//		WebElement btnForgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		btnForgot.click();
//		driver.navigate().refresh();
		//Alert
		
		//tabAlert
//		WebElement tabAlert = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
//		tabAlert.click();
//		//btnAlert
//		WebElement btnAlert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		btnAlert.click();
//		//Alerts
//		Alert a = driver.switchTo().alert();
//		a.sendKeys("Gokul");
//		a.accept();
//		
//		//Scroll Up&Down
//        JavascriptExecutor jk = (JavascriptExecutor) driver;
//        //text2020
//        WebElement text2020 = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
//        jk.executeScript("arguments[0].scrollIntoView(false)", text2020);
//        Thread.sleep(2000);
//        //textContent
//        WebElement textcontent = driver.findElement(By.xpath("//h2[contains(text(),'Content')]"));
//        jk.executeScript("arguments[0].scrollIntoView(false)", textcontent);

//		//Passing & Getting values
//		JavascriptExecutor jk = (JavascriptExecutor) driver;
//		WebElement textUsername = driver.findElement(By.id("email"));
//		jk.executeScript("arguments[0].setAttribute('value','Gokul')", textUsername);
//		Object attribute = jk.executeScript("arguments[0].setAttribute('value','Gokul')", textUsername);
//		String text = (String) attribute;
//		System.out.println(text);
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		jk.executeScript("arguments[0].click()", btnLogin);
		
//		//Screenshot
//		TakesScreenshot tk = (TakesScreenshot) driver;
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\Altius\\eclipse-workspace\\Jan2\\Screenshot\\fb.png");
//		FileUtils.copyFile(src, des);
		
		//Actions
//		Actions a = new Actions(driver);
		//Movetoelement
//		WebElement textCourses = driver.findElement(By.xpath("//div[@title='Courses']"));
//        a.moveToElement(textCourses).perform();
//        Thread.sleep(2000);
//        WebElement textOracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
//        a.moveToElement(textOracle).perform();
          //Drag & Drop
//		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//		WebElement des = driver.findElement(By.xpath("//ol[@id='bank']"));
//		a.dragAndDrop(src, des).perform();
		//Double&Context Click
//		WebElement textUsername = driver.findElement(By.id("email"));
//		textUsername.sendKeys("Gokul");
//		a.doubleClick(textUsername).perform();
//		a.contextClick(textUsername).perform();
		
		//Robot
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
////		r.keyPress(KeyEvent.VK_CONTROL);
////		r.keyPress(KeyEvent.VK_A);
////	    r.keyRelease(KeyEvent.VK_A);
////	    r.keyRelease(KeyEvent.VK_CONTROL);
////	    Thread.sleep(2000);
////	    r.keyPress(KeyEvent.VK_CONTROL);
////		r.keyPress(KeyEvent.VK_X);
////	    r.keyRelease(KeyEvent.VK_X);
////	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    
	    //Debug
	    //btnCreate
	    WebElement btnCreate = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	    btnCreate.click();
	    //textFirstname
	    WebElement textFirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	    textFirstname.sendKeys("Gokul");
	    //textLastname
	    WebElement textLastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    textLastname.sendKeys("Loganathan");
		
	}

}
