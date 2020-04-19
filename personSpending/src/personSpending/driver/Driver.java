package personSpending.driver;

import personSpending.validator.DriverValidator;


/**
 * @author John Doe TODO update the author name.
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
		
		

	}
}

enum Enum {
	INTEGER_EVENT, FLOATING_POINT_EVENT, PROCESSING_COMPLETE
}