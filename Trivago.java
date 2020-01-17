package SeleniumPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trivago {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.trivago.in/");
		WebElement search=driver.findElement(By.id("querytext"));
		search.sendKeys("Pune Airport,Pune");
		//driver.findElement(By.className("shighlightedsg-suggestion is-")).click();
		//Select dropCountry=new Select(driver.findElement(By.id("suggestion-3235294/500")));
		//  dropCountry.selectByVisibleText("Pune Airport,Pune");
		//driver.findElement(By.className("btn btn--primary btn--regular search-button js-search-button")).click();
		driver.get	("https://www.trivago.in/?aDateRange%5Barr%5D=2020-01-25&aDateRange%5Bdep%5D=2020-01-26&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=84040%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0&ra=");
}
}