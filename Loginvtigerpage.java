package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginvtigerpage {
	@FindBy(xpath="//button[text()='Sign in']")
    private WebElement signinbtn;
	
	@FindBy(xpath="//span[@class='app-icon fa fa-bars']")
	private WebElement ThreeLines;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	  private WebElement marketing;
	  
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaign;
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcampaign;
	
	@FindBy (id="Campaigns_editView_fieldName_campaignname")
	private WebElement name;
	
	@FindBy (id="Campaigns_editView_fieldName_targetsize")
	private WebElement size;
	
	@FindBy (id="Campaigns_editView_fieldName_targetaudience")
	private WebElement Type;
	
	
	@FindBy (id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponsor;
	
	@FindBy (id="Campaigns_editView_fieldName_closingdate")
	private WebElement eclosedate;
	
	@FindBy (id="Campaigns_editView_fieldName_expectedresponsecount")
	 private WebElement rcount;
	
	@FindBy (id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement scount;
	
	@FindBy (id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualscount;
	
	@FindBy (id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement arcount;
	
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement num;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getThreeLines() {
		return ThreeLines;
	}

	public WebElement getMarketing() {
		return marketing;
	}

	public WebElement getCampaign() {
		return campaign;
	}

	public WebElement getAddcampaign() {
		return addcampaign;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getType() {
		return Type;
	}

	public WebElement getSponsor() {
		return sponsor;
	}

	public WebElement getEclosedate() {
		return eclosedate;
	}

	public WebElement getRcount() {
		return rcount;
	}

	public WebElement getScount() {
		return scount;
	}

	public WebElement getActualscount() {
		return actualscount;
	}

	public WebElement getArcount() {
		return arcount;
	}

	public WebElement getNum() {
		return num;
	}
	
	@FindBy (id="Campaigns_editView_fieldName_budgetcost")
	private WebElement bcost;
	
	@FindBy (id="Campaigns_editView_fieldName_actualcost")
	private WebElement acount;
	
	@FindBy (id="Campaigns_editView_fieldName_expectedroi")
	private WebElement eroi;
	
	@FindBy (id="Campaigns_editView_fieldName_actualroi")
	 private WebElement roi;
	
	@FindBy (id="Campaigns_editView_fieldName_description")
	 private WebElement desc;
    
	@FindBy (id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement expected;
	
	@FindBy (id="product_id_display")
	private WebElement product;

	public WebElement getBcost() {
		return bcost;
	}

	public WebElement getAcount() {
		return acount;
	}

	public WebElement getEroi() {
		return eroi;
	}

	public WebElement getRoi() {
		return roi;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getExpected() {
		return expected;
	}

	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	
}
