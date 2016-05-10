package LogAnalysisEnhanced;

import java.io.IOException;

import java.util.ArrayList;

public class EnhancedNextState {

	public static String getNextState(String fileName, String state, String type, int ID) throws IOException {

		EnhancedLoadLogForAnalysis.loadLog(fileName);
		
		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);
		
		String nextState = null;

		int elementsPerLine = EnhancedCountLineElements.getCountLineElements(fileName);

		String arrayLine[] = new String[elementsPerLine];

		String doubleArrayLine[] = new String[elementsPerLine];

		for (String line : logArrayList) {

			arrayLine = line.split(",");

				int firstScanID = Integer.parseInt(arrayLine[1].trim());

				if ((arrayLine[0].trim().equals(type))
						&& (firstScanID == ID)
						&& (arrayLine[3].trim().equals(state))) {

					double timeOfOccurrence = Double.parseDouble(arrayLine[2].trim());

					for (String line2 : logArrayList) {

						doubleArrayLine = line2.split(",");

							int secondScanID = Integer.parseInt(doubleArrayLine[1].trim());

							if ((doubleArrayLine[0].trim().equals(type))
									&& (secondScanID == firstScanID)
									&& !(doubleArrayLine[3].trim().equals(state))) {

								double secondTimeOfOccurrence = Double
										.parseDouble(doubleArrayLine[2].trim());

								if (timeOfOccurrence < secondTimeOfOccurrence) {

									nextState = doubleArrayLine[3].trim();

									return nextState;

								}

							}

						}



				}

			}


		return nextState;

	}

}
