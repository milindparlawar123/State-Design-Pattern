package personSpending.validator;

/**
 * @author Milind
 * CustomValidatorI interface have methods which will be used by 
 * classes - needed to validate input file and items file content 
 */
public interface CustomValidatorI {

	void validateInputFile(String incoming);
	void validateAvItemsInputFile(String incoming);
}
