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
		
	}

}
