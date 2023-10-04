package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Loginvtigerpage;

public class Vtiger4 {
   
	WebDriver driver;
	
	@Test
   public void vtiger() throws IOException, InterruptedException {

	  FileInputStream fis = new FileInputStream("src\\test\\resources\\data.properties.txt");
	  Properties p = new Properties();
      p.load(fis);
      
      String BROWSER = p.getProperty("browser");
      if(BROWSER.equals("Chrome")) {
    	  driver = new ChromeDriver();
      }else if(BROWSER.equals("Firefox")) {
    	  driver = new FirefoxDriver();
      }else {
    	  driver = new EdgeDriver();
      }
      
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
             String URL = p.getProperty("url");
             String NAME = p.getProperty("Campaignname"); 
             String TA = p.getProperty("tagetaudience");
             String SPONSOR = p.getProperty("sponsor");
             String TS = p.getProperty("targetsize");
             String DATE = p.getProperty("Date");
             String NUMSENT = p.getProperty("numsent");
             String ESC = p.getProperty("expectedsalescount");
             String ERC = p.getProperty("expectedresponsecount");
             String ASC = p.getProperty("actualsalescount");
             String ARC = p.getProperty("actualresponsecount");
             String BUDGETCOST = p.getProperty("budgetcost");
             String ACTUALCOST = p.getProperty("actualcost");
             String EROI = p.getProperty("expectedroi");
             String AROI = p.getProperty("actualroi");
             String DESCRIPTION = p.getProperty("description");
             String ER = p.getProperty("expectedrevenue");
             String PRODUCT = p.getProperty("product");
             
             driver.get(URL);
      
             Loginvtigerpage lvp = new Loginvtigerpage();
             PageFactory.initElements(driver, lvp);
             lvp.getSigninbtn().click();
             lvp.getThreeLines().click();
             Thread.sleep(2000);
             Actions a = new Actions(driver);
             a.moveToElement(lvp.getMarketing()).perform();
             lvp.getCampaign().click();
             lvp.getAddcampaign().click();
             lvp.getName().sendKeys(NAME);
             lvp.getSize().sendKeys(TS);
             lvp.getType().sendKeys(TA);
             lvp.getSponsor().sendKeys(SPONSOR);
             lvp.getEclosedate().sendKeys(DATE);
             lvp.getEclosedate().sendKeys(Keys.ENTER);
             lvp.getRcount().sendKeys(ERC);
             lvp.getScount().sendKeys(ESC);
             lvp.getActualscount().sendKeys(ASC);
             lvp.getArcount().sendKeys(ARC);
             lvp.getNum().sendKeys(NUMSENT);
             lvp.getBcost().sendKeys(BUDGETCOST);
             lvp.getAcount().sendKeys(ACTUALCOST);
             lvp.getEroi().sendKeys(EROI);
             lvp.getRoi().sendKeys(AROI);
             lvp.getDesc().sendKeys(DESCRIPTION);
             lvp.getExpected().sendKeys(ER);
             lvp.getProduct().sendKeys(PRODUCT);
             lvp.getSave().click();
       }
}
