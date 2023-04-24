package CA2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Question3 {
	WebDriver driver;
public void f() {
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions co=new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(co);
	 driver.get("https://www.trivago.in/");
	 driver.manage().window().maximize();
	 String txt1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt2);
		String txt3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt3);
		String txt4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt4);
		String txt5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt5);
		driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[3]")).click();
		String currentprice=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p")).getText();
		String expectedprice="trivago.in - Compare hotel prices worldwide";
		System.out.println(currentprice);
		if(currentprice.equals(expectedprice)) {
			System.out.println("price Matched");
		}
		else {
			System.out.println("price not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button/span/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentContainer\"]/div[3]/ol/li[1]/div[2]/a/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"hotelNavBar\"]/div/ul/li[2]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ChildRoom-Ch8I2vnABhACIA4ojuUhMARAAUoJN0QxTl8xMDBQUJgFEgIIARoGEAIoBDAB\"]/div/div[4]/div[2]/div/div[1]/button/div")).click();
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"Fullname\"]"));
		txtBoxl.sendKeys("Pradeep");
}
}
