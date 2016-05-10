package LogAnalysisEnhanced;

import java.io.IOException;

import java.util.ArrayList;

public class EnhancedCountLineElements {

	public static int getCountLineElements(String fileName) throws IOException {

		int elements = 0;

		EnhancedLoadLogForAnalysis.loadLog(fileName);
		
		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);

			String line = logArrayList.get(0);

			for (int i = 0; i < line.length(); i++) {

				if (line.charAt(i) == ',') {

					elements++;

				}

			}

		return elements;

	}

}
