package personSpending.driver;

import java.io.IOException;

import personSpending.util.AvailableItems;
import personSpending.util.Constants;
import personSpending.util.FileProcessor;
import personSpending.util.Results;
import personSpending.validator.DriverValidator;

/**
 * @author Milind.
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the argument value
		 * is not given java takes the default value specified in build.xml. To avoid
		 * that, below condition is used FIXME Refactor commandline validation using the
		 * validation design taught in class.
		 */
		// below try block to validate arguments
		try {
			 new DriverValidator(args.length, args);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally {

		}
		try {
			AvailableItems availableItems = new AvailableItems();
			FileProcessor fileProcAvlbItems = new FileProcessor("availableItems.txt");

			String numberStr = null;
			Number num = null;
			while ((numberStr = fileProcAvlbItems.poll()) != null) {

				if (!numberStr.contains(":") || numberStr.split(":").length != 2) {
					System.out.println(Constants.ERROR_LINE_FORMAT);
					System.exit(0);
				}
				availableItems.addToAvailableItems(numberStr);
			}
			// System.out.println(availableItems.getAllAvailableItems());
			fileProcAvlbItems.close();

			FileProcessor fileProcInput = new FileProcessor("input.txt");
			Results results = new Results("output.txt", 2);

			PersonSpending personSpending = new PersonSpending(availableItems, results);

			while ((numberStr = fileProcInput.poll()) != null) {

				if (!numberStr.contains(":") && numberStr.split(":").length != 2) {
					System.out.println(Constants.ERROR_LINE_FORMAT);
					System.exit(0);
				}
				try {
					if (numberStr.contains("money")) {
						Integer.parseInt(numberStr.split(":")[1]);
					}

					if (numberStr.contains("money") && Integer.parseInt(numberStr.split(":")[1]) <= 0) {
						System.out.println(Constants.ERROR_MONEY);
						System.exit(0);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(Constants.ERROR_MONEY_VAL);
					System.exit(0);
				}
				finally {

				}
				personSpending.basic(numberStr);
			}

			results.writeToFile();
			results.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

		}
	}
}
