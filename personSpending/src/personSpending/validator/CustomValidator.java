package personSpending.validator;

import personSpending.util.Constants;

/**
 * @author Milind
 * CustomValidator is to validate content from input file
 * and available items file
 */
public class CustomValidator implements CustomValidatorI{

	@Override
	public void validateInputFile(String incoming) {
		if (!incoming.contains(":") && incoming.split(":").length != 2) {
			System.out.println(Constants.ERROR_LINE_FORMAT);
			System.exit(0);
		}
		try {
			if (incoming.contains("money")) {
				Integer.parseInt(incoming.split(":")[1]);
			}

			if (incoming.contains("money") && Integer.parseInt(incoming.split(":")[1]) <= 0) {
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
	}

	@Override
	public void validateAvItemsInputFile(String incoming) {
		if (!incoming.contains(":") || incoming.split(":").length != 2) {
			System.out.println(Constants.ERROR_LINE_FORMAT);
			System.exit(0);
		}
	}

	@Override
	public String toString() {
		return "CustomValidator []";
	}

}
