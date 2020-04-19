package personSpending.util;

/**
 * @author Milind. 
 * This class contains all constant which can be used across
 *         application
 */
public class Constants {

	public static final String ROUND_TO_TWO_DECIMAL = "%.2f";
	public static final String NEW_LINE = "\n";
	public static final String ERROR_OPENING_FILE = "exception occured while opening the file";
	public static final String ERROR_CLOSING_FILE = "exception occured while closing the file";
	public static final String ERROR_WRITING_FILE = "exception occured while writing to the file";
	public static final String ERROR_READING_FILE = "exception occured while reading the file";
	public static final String ERROR = "exception occured while processing input file";
	public static final String ERROR_INVALID_NUMBER = "Invalid number in file";
	public static final String ERROR_IN_REGISTER_OBSERVERS = "exception occured while registering observers";
	public static final String ERROR_INVALID_ARGUMENTS = "invalid argumnets ";
	public static final String ERROR_ALL_ARG_FILES_REQUIRED = "provide all 4 files: input.txt , run-avg-out.txt , top-k-out.txt and Running average window size and Max size of top K numbers ";
	public static final String ERROR_DUPLICATE_FILES = "two files should not be same";
	
	public static final String INTEGER_EVENT="INTEGER_EVENT";
	public static final String FLOATING_POINT_EVENT="FLOATING_POINT_EVENT";
	public static final String PROCESSING_COMPLETE="PROCESSING_COMPLETE";
	public static final String ERROR_NUM_THREADS = "privide valid numThreads value";
	public static final String ERROR_NUM_THREADS_SIZE =  "numThreads should be between 1 and 5";
	public static final String ERROR_CAPACITY = "privide valid capacity value";
	public static final String ERROR_CAPACITY_SIZE = "privide valid capacity size, greater than 0";
	public static final String ERROR_DEBUG = "privide valid debug value";
	public static final String ERROR_DEBUG_VALUE = "debug value should be between 0 and 4";
	public static final String ERROR_PERSISTER_SERVICE_PORT = "privide valid persister Service Port";
	public static final String ERROR_PERSISTER_SERVICE_PORT_RANGE = "persister Service Port value should be between 32768 and 50000";
	
	public static final String ARG_0="${inputNumStream}";
	public static final String ARG_1="${runAvgWindowSize}";
	public static final String ARG_2="${runAvgOutFile}";
	public static final String ARG_3="${k}";
	public static final String ARG_4="${topKNumOutFile}";
	public static final String ARG_5="${numPeaksOutFile}";
	
	

}
