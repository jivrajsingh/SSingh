package qaf.example.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class TableUtilities {

	public static QAFExtendedWebElement elemTable(String tableXpath, int rowNo, int colNo) {

		String xpathelem = tableXpath + "\tr[" + rowNo + "]\td[" + colNo + "]";
		return new QAFExtendedWebElement(xpathelem);
	}

	public int rowNoOfAnElement(String tableXpath, String elem) {

		int index = 0;
		List<WebElement> lstRow = new QAFExtendedWebElement(tableXpath).findElements(By.tagName("tr"));
		for (int i = 0; i < lstRow.size(); i++) {
			List<WebElement> lstCol = lstRow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < lstCol.size(); j++) {
				if (lstCol.get(j).getText().contains(elem)) {
					index = i + 1;
					break;
				}
			}

		}
		return index;
	}
	public int colNoOfAnElement(String tableXpath, String elem) {

		int index = 0;
		List<WebElement> lstRow = new QAFExtendedWebElement(tableXpath).findElements(By.tagName("tr"));
		for (int i = 0; i < lstRow.size(); i++) {
			List<WebElement> lstCol = lstRow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < lstCol.size(); j++) {
				if (lstCol.get(j).getText().contains(elem)) {
					index = j + 1;
					break;
				}
			}

		}
		return index;
	}

}
