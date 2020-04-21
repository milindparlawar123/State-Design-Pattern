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
				personSpending.getResults().addToList("BASIC::" + incoming.split(":")[1] + "--YES");
			} else {
				personSpending.getResults().addToList("BASIC::" + incoming.split(":")[1] + "--NO");
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

}
