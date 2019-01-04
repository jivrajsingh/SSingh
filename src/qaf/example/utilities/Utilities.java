package qaf.example.utilities;

import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class Utilities {
	
	public static void selfromDDVisText(QAFExtendedWebElement dDown,String text) {
		
		Select dropDown = new Select(dDown);
		dropDown.selectByVisibleText(text);
	}
public static void selfromDDValue(QAFExtendedWebElement dDown,String text) {
		
		Select dropDown = new Select(dDown);
		dropDown.selectByValue(text);
	}

}
