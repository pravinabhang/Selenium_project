package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GridTest1 {
	
	/* This is an example of Selenium GRID
	 * 
	 * Before executing, please start a HUB and atleast 1 NODE/.
	 * By default, a Selenium node will run 5 sessions of Firefox, 
	 * 5 sessions of Chrome 
	 * and 	 1 session of IE, 
	 * but it can only run a total of 5 sessions in parallel.
	 * 
	 * HUB and NODE needs to be started before xml suite file is executed.
	 * To Start HUB: Go to the folder where Selenium Standalone Jar is present
	 * and type the following command
	 * 
	 * java -jar selenium-server-standalone-3.5.2.jar -role hub
	 * 
	 * console URL : http://192.168.1.105:4444/grid/console
	 * 
	 * To Start NODE: Go to the folder where Selenium Standalone Jar is present
	 * and type the following command
	 * 
	 * Option1- (selenium 3.0)
	 * Node URL (ff+chrome)
	 * java -Dwebdriver.chrome.driver="D:\Radical_Selenium\chromedriver_win32_B45\chromedriver.exe" -Dwebdriver.gecko.driver="D:\Radical_Selenium\geckodriver-v0.18.0-win64\geckodriver.exe" -jar selenium-server-standalone-3.5.2.jar -role node -hub http://192.168.1.133:4444/grid/register/ -browser "browserName=firefox,version=ANY,platform=WINDOWS,maxInstances=5" -browser "browserName=chrome,version=ANY,platform=WINDOWS,maxInstances=5" -maxSession 5
	 * 
	 * Option2-(sometime not working for 3.0, it will work for 2.0)
	 * java -jar selenium-server-standalone-3.5.2.jar -role node -hub http://192.168.1.127:4444/grid/register/
	 * 
	 * 
	 * Node URL (chrome)
	 * java -Dwebdriver.chrome.driver="D:\Radical_Selenium\chromedriver_win32_B45\chromedriver.exe" -jar selenium-server-standalone-3.5.2.jar -role node -hub http://192.168.1.133:4444/grid/register -browser "browserName=chrome,version=ANY,platform=WINDOWS,maxInstances=5" -maxSession 5
	 * 
	 * 
	 * Here, we are starting the node on the same machine as the HUB, hence 'localhost' above.
	 * 
	 * 
	 * Please note that Internet Explorer can run only 1 instance on 1 node. Hence if you select
	 * Internet Explorer as the browser, it will execute sequentially.
	 * 
	 * Firefox and Chrome can run 5 instances on 1 node.
	 * 
	 * 
	*/
	
	@Parameters({ "browser" })
	@Test
	public void test1(String browserName) throws MalformedURLException, InterruptedException{
	
		WebDriver driver = null;
		if(browserName.equals("firefox")){
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			capabilities.setBrowserName(browserName);
			capabilities.setPlatform(Platform.ANY);
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		if(browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities =DesiredCapabilities.chrome();
			//capabilities.setBrowserName(browserName);
			capabilities.setPlatform(Platform.ANY);
			capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
			URL nodeURL = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(nodeURL, capabilities);
		}
		
		driver.get("http://www.google.com");
		Thread.sleep(10000);
		System.out.println("test1: Google: ");
		//driver.close();
	}

//	@Parameters({ "browser" })
//	@Test
//	public void test2(String browserName) throws MalformedURLException, InterruptedException{
//	
//		WebDriver driver = null;
//		if(browserName.equals("firefox")){
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities =DesiredCapabilities.firefox();
//			capabilities.setBrowserName(browserName);
//			capabilities.setPlatform(Platform.ANY);
//			URL nodeURL = new URL("http://localhost:4444/wd/hub");
//			//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
//			driver = new RemoteWebDriver(nodeURL, capabilities);
//		}
//		if(browserName.equals("chrome")){
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities =DesiredCapabilities.chrome();
//			capabilities.setBrowserName(browserName);
//			capabilities.setPlatform(Platform.ANY);
//			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
//			URL nodeURL = new URL("http://localhost:4444/wd/hub");
//			System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
//			driver = new RemoteWebDriver(nodeURL, capabilities);
//		}
//		driver.get("http://www.google.com");
//		Thread.sleep(14000);
//		System.out.println("test2: Google: ");
//		driver.quit();
//	}
//	
//	@Parameters({ "browser"})
//	@Test
//	public void test3(String browserName) throws MalformedURLException, InterruptedException{
//		
//		WebDriver driver = null;
//		if(browserName.equals("firefox")){
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities =DesiredCapabilities.firefox();
//			capabilities.setBrowserName(browserName);
//			capabilities.setPlatform(Platform.ANY);
//			URL nodeURL = new URL("http://localhost:4444/wd/hub");
//			driver = new RemoteWebDriver(nodeURL, capabilities);
//		}
//		if(browserName.equals("chrome")){
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities =DesiredCapabilities.chrome();
//			capabilities.setBrowserName(browserName);
//			capabilities.setPlatform(Platform.ANY);
//			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
//			URL nodeURL = new URL("http://localhost:4444/wd/hub");
//			System.setProperty("webdriver.chrome.driver","D:\\IBM\\workspace\\RadicalSelenium\\lib\\chromedriver.exe");
//			driver = new RemoteWebDriver(nodeURL, capabilities);
//		}
//		driver.get("http://www.google.com");
//		Thread.sleep(14000);
//		System.out.println("test3: Google: ");
//		driver.quit();
//	}
	
}
