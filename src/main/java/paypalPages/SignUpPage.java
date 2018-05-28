package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends NextPage{

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="email")
	WebElement mailID;
	public SignUpPage entermailadd(String data) {
		type(mailID, data);
		return this;
	}

	@FindBy(how=How.ID, using="password")
	WebElement pass;
	public SignUpPage enterpassword(String data) {
		type(pass, data);
		return this;
	}

	@FindBy(how=How.ID, using="confirmPassword")
	WebElement confirmpass;
	public SignUpPage confirmpassword(String data) {
		type(confirmpass, data);
		return this;
	}

}
