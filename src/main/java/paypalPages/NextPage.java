package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class NextPage extends ProjectMethods {

	public NextPage() {
		PageFactory.initElements(driver,this);
	}
		@FindBy(how=How.ID, using="radio-personal")
		WebElement Shoppersradio;
		
		public NextPage radioclick() {
			verifySelected(Shoppersradio);
			return this;
		}
		
		@FindBy(how=How.LINK_TEXT, using="Next")
		WebElement Nextbutton;
		
		public SignUpPage clickNext() {
			click(Nextbutton);
			return new SignUpPage();
		}
		}

	



