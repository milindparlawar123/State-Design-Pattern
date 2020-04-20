package personSpending.states;

import personSpending.driver.PersonSpending;

public class HasMoney implements PersonStatesI {

	PersonSpending personSpending;

	public HasMoney(PersonSpending personSpending) {
		this.personSpending = personSpending;
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

	}

	@Override
	public void money(String incoming) {
		// TODO Auto-generated method stub
		try {
			personSpending.getResults().addToQueue(Integer.parseInt(incoming.split(":")[1]));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		personSpending.setPerStates(personSpending.getHasBasicState());

	}

}
