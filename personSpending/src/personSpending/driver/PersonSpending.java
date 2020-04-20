package personSpending.driver;

import personSpending.states.HasBasicState;
import personSpending.states.HasExtravagantState;
import personSpending.states.HasLuxuriousState;
import personSpending.states.PersonStatesI;

public class PersonSpending {

	PersonStatesI hasBasic;
	PersonStatesI hasLuxurious;
	PersonStatesI hasExtravagant;

	PersonStatesI perStates;

	public PersonSpending() {
		hasBasic = new HasBasicState(this);
		hasLuxurious = new HasLuxuriousState(this);
		hasExtravagant = new HasExtravagantState(this);
	}

	public PersonStatesI getHasBasicState() {
		return hasBasic;
	}

	public PersonStatesI getHasLuxuriousState() {
		return hasLuxurious;
	}

	public PersonStatesI getHasExtravagantState() {
		return hasExtravagant;
	}

	public PersonStatesI getPerStates() {
		return perStates;
	}

	public void setPerStates(PersonStatesI perStates) {
		this.perStates = perStates;
	}

}
