package SeleniumPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivagochkin {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe" );
				//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
				//capabilities.setCapability("marionette",true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.in/?aDateRange%5Barr%5D=2020-01-25&aDateRange%5Bdep%5D=2020-01-26&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=84040%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0&ra=");

		WebElement email=driver.findElement(By.id("dealform-button js-dealform-button-calendar dealform-button--checkin"));

}
}
