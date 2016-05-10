package LogAnalysisEnhanced;

import java.io.IOException;

import java.util.ArrayList;


public class EnhancedCountOccurrencies {

	public static int getCountOccurencies(String fileName, String state) throws IOException {

		EnhancedLoadLogForAnalysis.loadLog(fileName);
		
		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);
		
		int countOfOccurencies = 0;

		int lineElements = EnhancedCountLineElements.getCountLineElements(fileName);

		String arrayLine[] = new String[lineElements];

		for (String line : logArrayList) {

				arrayLine = line.split(",");

				if (arrayLine[3].trim().equals(state.trim())) {

					countOfOccurencies++;

				}
				
			}
		
		return countOfOccurencies;

	}
	
}
