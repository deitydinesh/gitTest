package sampleTest1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {

	@Test
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.co.in/");
		
		File Src = 	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src, new File ("C:\\Users\\deity\\Mr.D_Eclipse\\MyFirstProject\\gitTest\\screenshot\\google.png"));
	
	}
}
