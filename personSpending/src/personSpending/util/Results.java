package personSpending.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Results implements PersisterI {
	Queue<Integer> q = new LinkedList<>();
	Double runningAverage=0.00;
	List<String> out = new ArrayList<String>();
	Integer windowSize;
	private File file;
	private BufferedWriter fileWriter;

	public Results(String inputFilePath, Integer size) {
		windowSize = size;

		file = new File(inputFilePath);
		try {
			this.fileWriter = new BufferedWriter(new FileWriter(file));

		} catch (IOException e) {
			System.err.println(Constants.ERROR_OPENING_FILE);
			e.printStackTrace();
			System.exit(0);
		} finally {

		}

	}

	public Queue<Integer> getQ() {
		return q;
	}

	public void setQ(Queue<Integer> q) {
		this.q = q;
	}

	public void addToList(String incoming) {
		out.add(incoming);
	}

	public List<String> getOut() {
		return out;
	}

	public void setOut(List<String> out) {
		this.out = out;
	}

	public Integer getWindowSize() {
		return windowSize;
	}

	public void setWindowSize(Integer windowSize) {
		this.windowSize = windowSize;
	}	
	
	public Double getRunningAverage() {
		return runningAverage;
	}

	public void setRunningAverage(Double runningAverage) {
		this.runningAverage = runningAverage;
	}

	@Override
	public void close() {try {
		this.fileWriter.close();
	} catch (IOException e) {
		System.err.println(Constants.ERROR_CLOSING_FILE);
		e.printStackTrace();
		System.exit(0);
	}finally {
		
	}}

	@Override
	public void writeToFile() {
		
		for (int i = 0; i < out.size(); i++) {
			try {
				this.fileWriter.write(out.get(i).toString());
				this.fileWriter.write(Constants.NEW_LINE);
			} catch (IOException e) {
				System.err.println(Constants.ERROR_WRITING_FILE);
				e.printStackTrace();
				System.exit(0);
			}finally{}
		}
	
	}

}
