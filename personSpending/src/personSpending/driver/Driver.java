package personSpending.driver;

import java.io.IOException;

import personSpending.util.AvailableItems;
import personSpending.util.Constants;
import personSpending.util.FileProcessor;
import personSpending.util.Results;
import personSpending.validator.CustomValidator;
import personSpending.validator.CustomValidatorI;
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
		
		CustomValidatorI validator= new CustomValidator();
		try {
			AvailableItems availableItems = new AvailableItems();
			FileProcessor fileProcAvlbItems = new FileProcessor("availableItems.txt");

			String numberStr = null;
			Number num = null;
			while ((numberStr = fileProcAvlbItems.poll()) != null) {

				validator.validateAvItemsInputFile(numberStr);
				
				availableItems.addToAvailableItems(numberStr);
			}
			// System.out.println(availableItems.getAllAvailableItems());
			fileProcAvlbItems.close();

			FileProcessor fileProcInput = new FileProcessor("input.txt");
			Results results = new Results("output.txt", 2);

			PersonSpending personSpending = new PersonSpending(availableItems, results);

			while ((numberStr = fileProcInput.poll()) != null) {

				validator.validateInputFile(numberStr);
				
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
