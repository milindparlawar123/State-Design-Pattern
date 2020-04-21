package personSpending.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Milind
 *
 *below class is to read data from input file
 */
public final class FileProcessor {
	private BufferedReader reader;
	private String line;

	public FileProcessor(String inputFilePath)
			throws InvalidPathException, SecurityException, FileNotFoundException, IOException {

		if (!Files.exists(Paths.get(inputFilePath))) {
			throw new FileNotFoundException(Constants.ERROR_INVALID_INPUT_FILE);
		}

		reader = new BufferedReader(new FileReader(new File(inputFilePath)));
		line = reader.readLine();
		if (line == null) {
			System.out.println(inputFilePath + Constants.ERROR_EMPTY_FILE);
			System.exit(0);
		}
	}

	public String poll() throws IOException {
		if (null == line)
			return null;

		String newValue = line.trim();
		line = reader.readLine();
		return newValue;
	}

	public void close() throws IOException {
		try {
			reader.close();
			line = null;
		} catch (IOException e) {
			throw new IOException(Constants.ERROR_CLOSING_FILE, e);
		} finally {

		}
	}

	@Override
	public String toString() {
		return "FileProcessor [reader=" + reader + ", line=" + line + "]";
	}
		
}
