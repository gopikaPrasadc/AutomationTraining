package handlesleep;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageutility {
		public WebDriver driver;

		public static WebElement isElementLoaded(WebDriver driver, WebElement elementToBeLoaded, int time){
			WebDriverWait wait = new WebDriverWait(driver, time);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
			return element;
		}
		public static List<WebElement> waitforlistofelementtobeclickable(WebDriver driver, List<WebElement> listtobeloaded, int time){
			WebDriverWait wait = new WebDriverWait(driver, time);
			List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElements(listtobeloaded));
			return element;
		}
		public static void waitForFrame(WebDriver driver, WebElement frametoswitch, int time){
			WebDriverWait wait = new WebDriverWait(driver, time);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frametoswitch));
			
		}
		
		public static void alertIsPresent(WebDriver driver,  int time){
			WebDriverWait wait = new WebDriverWait(driver, time);
			 wait.until(ExpectedConditions.alertIsPresent());
			
		}
		
		public static void waitfortextpresentinElement(WebDriver driver,WebElement message,  String string, int time){
			WebDriverWait wait = new WebDriverWait(driver, time);
			 wait.until(ExpectedConditions.textToBePresentInElementValue(message, string));
			
		}
		
		
		
		public static void handleSleep(long time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
		public static WebElement waitforelementtobeclickable(WebDriver driver, WebElement elementtobeclick, int i) {
			WebDriverWait wait = new WebDriverWait(driver, i);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(elementtobeclick));
			return element;
			
		}
	}


