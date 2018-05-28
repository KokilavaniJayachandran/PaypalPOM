package payPalTestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import paypalPages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_PayPalSignUp extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC001_PayPalSignUp";
		testDescription="SignUpPage";
		testNodes="PayPal";
		category="Smoke";
		authors="Kokila";
		browserName="chrome";
		dataSheetName="TC001_PayPalSignUp";
	}
	@Test(dataProvider="fetchData")
	public void HomePage(String mail, String pass, String confirmPass) {

		new HomePage()
		.clickSign()
		.radioclick()
		.clickNext()
		.entermailadd(mail)
		.enterpassword(pass)
		.confirmpassword(confirmPass);
	}

}
