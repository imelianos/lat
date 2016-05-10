package LogAnalysisEnhanced;

import java.io.IOException;

import java.util.ArrayList;

public class EnhancedCountExactTransitions {

	// This method checks if the user passes from the fromState to the toState
	// WITHOUT any intermediate states-
	// IT CHECKS if there are intermediate states between the ones chosen to
	// input to the method

	public static int getCountExactTransitions(String fileName,
			String fromState, String toState, String type) throws IOException {

		EnhancedLoadLogForAnalysis.loadLog(fileName);
		
		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);
		
		int elementsPerLine = EnhancedCountLineElements.getCountLineElements(fileName);

		int exactOccurenciesCount = 0;

		int ID = 0;

		int count = 0;

		String arrayLine[] = new String[elementsPerLine];

		for (String line : logArrayList) {

			arrayLine = line.split(",");

			if (arrayLine[3].trim().equals(fromState)
					&& arrayLine[0].trim().equals(type)) {

				ID = Integer.parseInt(arrayLine[1].trim());

				if ((toState.trim().equals(EnhancedNextState.getNextState(fileName,
						fromState, type, ID)))) {

					exactOccurenciesCount++;

				}

			}
			
			count++;

			 System.out.println((100*count)/logArrayList.size()+" %");

		}
				
		return exactOccurenciesCount;

	}

}
