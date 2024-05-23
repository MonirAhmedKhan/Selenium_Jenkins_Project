package step_Definitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hook extends Base {
//    @Before
//    public void startUp() {
//       WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
	@Before
	public void setup() throws MalformedURLException {
		ChromeOptions opt = new ChromeOptions();

		driver = new RemoteWebDriver(new URL("http://3.142.141.206:4444"), opt);

	}

    @After
    public void trDown() {
        driver.quit();
    }
 }
