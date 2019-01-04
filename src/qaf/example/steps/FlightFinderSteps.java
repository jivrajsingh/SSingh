package qaf.example.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

import qaf.example.beans.FlightFinder;
import qaf.example.utilities.Utilities;


public class FlightFinderSteps {
	@QAFTestStep(description = "fill details in flightfinder {0}", stepName = "fillDetailsinFlightFinder")
	public void fillDetailsinFlightFinder(String DataMap) {
		FlightFinder baseDataBean = new FlightFinder();
		baseDataBean.fillFromConfig(DataMap);
        if(baseDataBean.getTripType().contains("Round Trip"))
        		{
		new QAFExtendedWebElement("flightfinder.radio.triptype1").click();
        }
        if(baseDataBean.getTripType().contains("One Way"))
		{
            new QAFExtendedWebElement("flightfinder.radio.triptype2").click();
            }
        QAFExtendedWebElement dDown = new QAFExtendedWebElement("flightfinder.select.passengers");
		Utilities.selfromDDValue(dDown, baseDataBean.getPassengers());
		dDown = new QAFExtendedWebElement("flightfinder.select.from");
		Utilities.selfromDDValue(dDown, baseDataBean.getDepFrom());
		dDown = new QAFExtendedWebElement("flightfinder.select.frommonth");
		Utilities.selfromDDValue(dDown, baseDataBean.getOnMonth());
		dDown = new QAFExtendedWebElement("flightfinder.select.fromday");
		Utilities.selfromDDVisText(dDown, baseDataBean.getOnDate());
		dDown = new QAFExtendedWebElement("flightfinder.select.to");
		Utilities.selfromDDVisText(dDown, baseDataBean.getArrival());
		dDown = new QAFExtendedWebElement("flightfinder.select.tomonth");
		Utilities.selfromDDVisText(dDown, baseDataBean.getRetMonth());
		dDown = new QAFExtendedWebElement("flightfinder.select.today");
		Utilities.selfromDDVisText(dDown, baseDataBean.getRetDate());		
		new QAFExtendedWebElement("flightfinder.button.continue").click();
		

	}

}
