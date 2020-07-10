package seleniumLearningFromUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkartpurchase {

	public static void main(String[] args) throws InterruptedException {

		String[] itemsNeedsToBeInCart = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };

		System.setProperty("webdriver.chrome.driver",
				"E:\\Files\\Selenium learning from udemy course\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, 5);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, itemsNeedsToBeInCart);

		driver.findElement(By.cssSelector(("img[alt='Cart']"))).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));

		System.out.println(driver.findElement(By.className("promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeedsToBeInCart) {

		int count = 0;

		// Convert this array into array list to do more actions

		List convertedItemsNeedsToBeInCart = Arrays.asList(itemsNeedsToBeInCart);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] productCompleteName = products.get(i).getText().split("-");

			String productNameAfterTrim = productCompleteName[0].trim();

			if (convertedItemsNeedsToBeInCart.contains(productNameAfterTrim)) {

				driver.findElements(By.xpath(" //div[@class='product-action']/button")).get(i).click();

				count++;

				if (itemsNeedsToBeInCart.length < count) {

					break;
				}
			}
		}

	}

}
