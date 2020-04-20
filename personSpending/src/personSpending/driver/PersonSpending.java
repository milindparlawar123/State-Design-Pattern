package personSpending.driver;

import personSpending.states.HasBasicState;
import personSpending.states.HasExtravagantState;
import personSpending.states.HasLuxuriousState;
import personSpending.states.HasMoney;
import personSpending.states.PersonStatesI;
import personSpending.util.AvailableItems;
import personSpending.util.Results;

public class PersonSpending {

	PersonStatesI hasBasic;
	PersonStatesI hasLuxurious;
	PersonStatesI hasExtravagant;
	PersonStatesI hasMoney;

	PersonStatesI perStates;
	AvailableItems availableItems;
	Results results;

	public PersonSpending(AvailableItems availableItems, Results results) {
		hasBasic = new HasBasicState(this);
		hasLuxurious = new HasLuxuriousState(this);
		hasExtravagant = new HasExtravagantState(this);
		hasMoney = new HasMoney(this);
		this.availableItems = availableItems;
		this.results = results;
		perStates = hasBasic;
	}

	public void basic(String incoming) {
		perStates.basic(incoming);
	}

	public void luxurious(String incoming) {
		perStates.luxurious(incoming);
	}

	public void extravagant(String incoming) {
		perStates.extravagant(incoming);
	}

	public void money(String incoming) {
		perStates.money(incoming);
	}

	public AvailableItems getAvailableItems() {
		return availableItems;
	}

	public void setAvailableItems(AvailableItems availableItems) {
		this.availableItems = availableItems;
	}

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
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

	public PersonStatesI getHasMoneyState() {
		return hasMoney;
	}

	public PersonStatesI getPerStates() {
		return perStates;
	}

	public void setPerStates(PersonStatesI perStates) {
		this.perStates = perStates;
	}

}
