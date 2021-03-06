package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(how=How.ID, using="signup-button")
	WebElement signup;
	public NextPage clickSign(){
		click(signup);
		return new NextPage();
		
}
}