package qaf.practice.steps;

import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.StringUtil;

public class RegisterUserStep {

	@QAFTestStep(description = "fill details in form {0}")
	public void filldeatilsinform(Map<String, String> DataMap)  {
		if (StringUtil.isNotBlank(DataMap.get("fname"))) {
			new QAFExtendedWebElement("registrationpage.text.fname").sendKeys(DataMap.get("fname"));
		}

		if (StringUtil.isNotBlank(DataMap.get("lname"))) {
			new QAFExtendedWebElement("registrationpage.text.lname").sendKeys(DataMap.get("lname"));
		}
		if (StringUtil.isNotBlank(DataMap.get("phone"))) {
			new QAFExtendedWebElement("registrationpage.text.phone").sendKeys(DataMap.get("phone"));
		}
		if (StringUtil.isNotBlank(DataMap.get("email"))) {
			new QAFExtendedWebElement("registrationpage.text.email").sendKeys(DataMap.get("email"));
		}
		if (StringUtil.isNotBlank(DataMap.get("address"))) {
			new QAFExtendedWebElement("registrationpage.text.address").sendKeys(DataMap.get("address"));
		}
		if (StringUtil.isNotBlank(DataMap.get("address2"))) {
			new QAFExtendedWebElement("registrationpage.text.address2").sendKeys(DataMap.get("address2"));
		}
		if (StringUtil.isNotBlank(DataMap.get("city"))) {
			new QAFExtendedWebElement("registrationpage.text.city").sendKeys(DataMap.get("city"));
		}
		if (StringUtil.isNotBlank(DataMap.get("postal"))) {
			new QAFExtendedWebElement("registrationpage.text.pcode").sendKeys(DataMap.get("postal"));
		}
		if (StringUtil.isNotBlank(DataMap.get("state"))) {
			new QAFExtendedWebElement("registrationpage.text.state").sendKeys(DataMap.get("state"));
		}
		if (StringUtil.isNotBlank(DataMap.get("country"))) {
			QAFExtendedWebElement dDown=new QAFExtendedWebElement("registrationpage.text.country");
			Select dropDown=new Select(dDown);
			dropDown.selectByVisibleText(DataMap.get("country"));
		}
		
		if (StringUtil.isNotBlank(DataMap.get("username"))) {
			new QAFExtendedWebElement("registrationpage.text.uname").sendKeys(DataMap.get("username"));
		}
		if (StringUtil.isNotBlank(DataMap.get("password"))) {
			new QAFExtendedWebElement("registrationpage.text.pwd").sendKeys(DataMap.get("password"));
			new QAFExtendedWebElement("registrationpage.text.cpwd").sendKeys(DataMap.get("password"));
		}
		
		new QAFExtendedWebElement("registrationpage.button.submit").click();
		new QAFExtendedWebElement("registrationpage.msg.success").assertText(DataMap.get("msg"), "User registered message");
		
	}
}
