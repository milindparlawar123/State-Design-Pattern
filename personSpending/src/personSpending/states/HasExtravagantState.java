package personSpending.states;

import personSpending.driver.PersonSpending;
import personSpending.util.Constants;

/**
 * @author Anand
 * HasExtravagantState state will execute its method when running average 
 * Condition  50000  <=  running average of money earned
 */
public class HasExtravagantState implements PersonStatesI {

	PersonSpending personSpending;
	public HasExtravagantState(PersonSpending personSpending) {
		this.personSpending=personSpending;
	}
	@Override
	public void basic(String incoming) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void luxurious(String incoming) {}

	/**
	 *below method will check condition which is mentioned at class level
	 * before adding output to data structure: 
	 */
	@Override
	public void extravagant(String incoming) {
		// TODO Auto-generated method stub

		boolean flag=true;
		try {
			Integer.parseInt(incoming.split(":")[1]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			flag=false;
			//e.printStackTrace();
		}
		if (!flag && personSpending.getResults().getRunningAverage() >=50000) {
			if (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1])!= null && (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("moderatelyExpensive") || personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("basic") ||personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("superExpensive"))) {
				personSpending.getResults().addToList(Constants.MSG_EXTRAVAGANT + incoming.split(":")[1]+Constants.MSG_YES);
			} else {
				personSpending.getResults().addToList(Constants.MSG_EXTRAVAGANT + incoming.split(":")[1]+Constants.MSG_NO);
			}

		}
		else {
			personSpending.setPerStates(personSpending.getHasMoneyState());
			personSpending.money(incoming);
		}
		personSpending.setPerStates(personSpending.getHasBasicState());
	
		
	}
	@Override
	public void money(String incoming) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "HasExtravagantState [personSpending=" + personSpending + "]";
	}

}
