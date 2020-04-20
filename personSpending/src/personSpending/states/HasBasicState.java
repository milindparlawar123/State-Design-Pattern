package personSpending.states;

import personSpending.driver.PersonSpending;

public class HasBasicState implements PersonStatesI {
	PersonSpending personSpending;

	public HasBasicState(PersonSpending personSpending) {
		this.personSpending = personSpending;
	}

	@Override
	public void basic(String incoming) {
		// TODO Auto-generated method stub

		if (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("basic")) {
			if (personSpending.getResults().getRunningAverage() >= 0.00
					&& personSpending.getResults().getRunningAverage() < 10000) {
				personSpending.getResults().addToList("BASIC::" + incoming.split(":")[1]+"--YES");
			} else {
				personSpending.getResults().addToList("BASIC::" + incoming.split(":")[1]+"--NO");
			}

		}else {
			personSpending.setPerStates(personSpending.getHasExtravagantState());
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

}
