package qaf.example.steps;

import java.util.Map;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.StringUtil;


	public class LoginPageSteps {

		
		@QAFTestStep(description = "login with {0} and {1}")
		public void loginWithAnd(String userName, String password) {
			new QAFExtendedWebElement("loginpage.input.username").sendKeys(userName);
			new QAFExtendedWebElement("loginpage.input.password").sendKeys(password);
			new QAFExtendedWebElement("loginpage.button.login").click();
			new QAFExtendedWebElement("DashBoard.button.continue").waitForPresent();
		}
		
		@QAFTestStep(description = "login with invalid details {0}")
		public void loginWithInvalidDetails(Map<String, String> DataMap)  {
			if (StringUtil.isNotBlank(DataMap.get("username"))) {
				new QAFExtendedWebElement("loginpage.input.username").sendKeys(DataMap.get("username"));
			}

			if (StringUtil.isNotBlank(DataMap.get("password"))) {
				new QAFExtendedWebElement("loginpage.input.password").sendKeys(DataMap.get("password"));
			}
			
			new QAFExtendedWebElement("loginpage.button.login").click();
		}

		
	}