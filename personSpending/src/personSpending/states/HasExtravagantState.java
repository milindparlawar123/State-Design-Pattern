package personSpending.states;

import personSpending.driver.PersonSpending;

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
	public void luxurious(String incoming) {
		// TODO Auto-generated method stub


		if (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("moderatelyExpensive")) {
			if (personSpending.getResults().getRunningAverage() >= 10000
					&& personSpending.getResults().getRunningAverage() < 50000) {
				personSpending.getResults().addToList("LUXURIOUS::" + incoming.split(":")[1]+"--YES");
			} else {
				personSpending.getResults().addToList("LUXURIOUS::" + incoming.split(":")[1]+"--NO");
			}

		}else {
			personSpending.setPerStates(personSpending.getHasMoneyState());
		}

	
		
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
