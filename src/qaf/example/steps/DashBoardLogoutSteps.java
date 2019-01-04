package qaf.example.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class DashBoardLogoutSteps {

	@QAFTestStep(description = "logout from")
	public void logoutFrom() {
		new QAFExtendedWebElement("DashBoard.link.signoff").click();
		new QAFExtendedWebElement("loginpage.button.login").waitForPresent();
	}

}
