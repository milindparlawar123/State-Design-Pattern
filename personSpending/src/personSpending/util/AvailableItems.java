package personSpending.util;

import java.util.HashMap;

/**
 * @author Milind
 *below class is to store all items in HashMap
 */
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
	public String getValueByKey(String key) {
		return this.items.get(key);
	}

	@Override
	public String toString() {
		return "AvailableItems [items=" + items + "]";
	}
	
	

}
