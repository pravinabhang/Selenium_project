package advanced.myassgnment;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadFileProfileSetting {
	
	
	public static WebDriver fireFoxProfile(){

		System.setProperty("webdriver.gecko.driver",
				"D:\\Radical_Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		 FirefoxProfile fprofile = new FirefoxProfile();//Create object of FirefoxProfile  to access Its properties.
		  fprofile.setPreference("browser.download.dir", "D:\\TestB17");//Set Location to store files after downloading.
		  fprofile.setPreference("browser.download.folderList", 2);//Set Preference to not show file download confirmation dialogue using  types Of different file extension types.
		  
		  fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"//types Of MS Excel File.
		    + "application/pdf;" //types Of PDF File.
		    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //types Of MS doc File.
		    + "text/plain;" //types Of text File.
		    + "text/csv"); //types Of CSV File.
		  fprofile.setPreference( "browser.download.manager.showWhenStarting", false );
		  fprofile.setPreference( "pdfjs.disabled", true );
		  
		  cap.setCapability(FirefoxDriver.PROFILE, fprofile);
		  //cap.setCapability("marionette", true);
		  WebDriver driver = new FirefoxDriver(cap);  
		  
		  return driver;
		
	}
	
	public static WebDriver chromeProfile(){
		
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", "D:\\TestABC");
	       ChromeOptions options = new ChromeOptions();
	       HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	       options.setExperimentalOption("prefs", chromePrefs);
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
	  
	       DesiredCapabilities cap = DesiredCapabilities.chrome();
	       cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	       cap.setCapability(ChromeOptions.CAPABILITY, options);
	       WebDriver driver = new ChromeDriver(cap);  
		
	       	return driver;
		
	}

}
