package personSpending.states;

import personSpending.driver.PersonSpending;

public class HasLuxuriousState implements PersonStatesI{

	
	PersonSpending personSpending;
	public HasLuxuriousState(PersonSpending personSpending) {
		this.personSpending=personSpending;
	}
	@Override
	public void basic(String incoming) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void luxurious(String incoming) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extravagant(String incoming) {
		// TODO Auto-generated method stub
		
		if (personSpending.getAvailableItems().getValueByKey(incoming.split(":")[1]).equals("superExpensive")) {
			if (personSpending.getResults().getRunningAverage() >= 50000
				) {
				personSpending.getResults().addToList("EXTRAVAGANT::" + incoming.split(":")[1]+"--YES");
			} else {
				personSpending.getResults().addToList("EXTRAVAGANT::" + incoming.split(":")[1]+"--NO");
			}

		}else {
			personSpending.setPerStates(personSpending.getHasExtravagantState());
		}

		
	}
	@Override
	public void money(String incoming) {
		// TODO Auto-generated method stub
		
	}

}
