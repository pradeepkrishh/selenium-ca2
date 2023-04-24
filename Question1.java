package CA2;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
  @Test
 
  public void f() throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.navigate().to("https://www.trivago.in/");
driver.manage().window().maximize();
String Exceptedtitle = "Trivago";
String Actualtitle = driver.getTitle();
System.out.println(Actualtitle);
if(Exceptedtitle.equals(Actualtitle))
{
	System.out.println("Title is valid");
}
else
{
	System.out.println("Title is not valid");
}
WebElement location = driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
location.sendKeys("Munnar");
Thread.sleep(1000);
WebElement checkin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span"));
checkin.click();
Thread.sleep(1000);
WebElement indate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[5]/time"));
indate.click();

WebElement checkout = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[2]/span"));
checkout.click();
checkout.click();
Thread.sleep(1000);
WebElement outdate = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button[26]/time"));
outdate.click();

WebElement guest_rooms = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/button/span"));
guest_rooms.click();
guest_rooms.click();
Thread.sleep(1000);
WebElement adult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
adult.click();
Thread.sleep(1000);
WebElement child = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/button[2]/span/span[1]"));
child.click();
Thread.sleep(1000);
WebElement req = driver.findElement(By.xpath("//*[@id=\"childrens-age18\"]"));
req.click();
Thread.sleep(1000);

WebElement check = driver.findElement(By.xpath("//*[@id=\"checkbox-17\"]"));
check.click();
Thread.sleep(1000);
WebElement apply = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
apply.click();
Thread.sleep(1000);
WebElement search = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button"));
search.click();
Thread.sleep(36000);
WebElement p_range = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div[2]"));
p_range.click();
Thread.sleep(1000);
WebElement type = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div/label"));
type.click();
Thread.sleep(1000);
WebElement rating = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span"));
rating.click();
Thread.sleep(1000);

WebElement rat = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span/span[1]"));
rat.click();
Thread.sleep(1000);
WebElement filters = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button/span"));
filters.click();
Thread.sleep(1000);
WebElement f_apply = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div/div/div/div[5]/div/div/div/div[2]/section/footer/button[2]"));
f_apply.click();
Thread.sleep(1000);



}

}
