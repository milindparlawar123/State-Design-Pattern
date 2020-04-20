package personSpending.util;

import java.util.HashMap;

public class AvailableItems {
	private HashMap<String, String> items;

	public AvailableItems() {
		items = new HashMap<String, String>();
	}

	public void addToAvailableItems(String itemIn) {

		String key = itemIn.split(":")[1];
		String value = itemIn.split(":")[0];
		items.put(key, value);

	}

	public HashMap<String, String> getAllAvailableItems() {
		return items;
	}

}
