package LogAnalysisEnhanced;

import java.util.ArrayList;

public class EnhancedReadLog {

	public void readFile(String fileName) {

		EnhancedLoadLogForAnalysis.loadLog(fileName);

		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);

		for (String line : logArrayList) {

			System.out.println(line);
		}

	}

}