package personSpending.states;

import personSpending.driver.PersonSpending;
import personSpending.util.Constants;

/**
 * @author Anand
 * HasExtravagantState state will execute its method when running average 
 * Condition  0  <=  running average of money earned <10000
 */
public class HasBasicState implements PersonStatesI {
	PersonSpending personSpending;

	public HasBasicState(PersonSpending personSpending) {
		this.personSpending = personSpending;
	}
	
	/**
	 *below method will check condition which is mentioned at class level
	 * before adding output to data structure: 
	 */
	@Override
	public void basic(String incoming) {
		// TODO Auto-generated method stub

		boolean flag = true;
		try {
			Integer.parseInt(incoming.split(":")[1]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			flag = false;
			// e.printStackTrace();
		}
		if (!flag && personSpending.getResults().getRunningAverage() >= 0.00
				&& personSpending.getResults().getRunningAverage() < 10000) {
			if (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]) != null
					&& personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("basic")) {
				personSpending.getResults().addToList(Constants.MSG_BASIC + incoming.split(":")[1] + Constants.MSG_YES);
			} else {
				personSpending.getResults().addToList(Constants.MSG_BASIC + incoming.split(":")[1] + Constants.MSG_NO);
			}

		}
		else {
			personSpending.setPerStates(personSpending.getHasLuxuriousState());
			personSpending.luxurious(incoming);
		}

	}

	@Override
	public void luxurious(String incoming) {
		// TODO Auto-generated method stub

	}

	@Override
	public void extravagant(String incoming) {
		// TODO Auto-generated method stub

	}

	@Override
	public void money(String incoming) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "HasBasicState [personSpending=" + personSpending + "]";
	}

}
