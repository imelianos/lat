package LogAnalysis;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class CountExactTransitions {
	
	// This method checks if the user passes from the fromState to the toState WITHOUT any intermediate states-
	// IT CHECKS if there are intermediate states between the ones chosen to input to the method

	public static int getCountExactTransitions(String fileName,	String fromState, String toState, String type) throws IOException {
		
		File file = new File(fileName);

		int elementsPerLine = CountLineElements.getCountLineElements(fileName);

		int exactOccurenciesCount = 0;

		int ID = 0;

		String arrayLine[] = new String[elementsPerLine];

		String doubleArrayLine[] = new String[elementsPerLine];

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {

			String lineInput = scanner.nextLine();

			arrayLine = lineInput.split(",");

			// check if read line has the fromState, if it has, create
			// doubleScanner which scans again the log to find the to state

			if (arrayLine[3].trim().equals(fromState.trim())
					&& arrayLine[0].trim().equals(type.trim())) {

				ID = Integer.parseInt(arrayLine[1].trim());

				Scanner doubleScanner = new Scanner(file);

				while (doubleScanner.hasNextLine()) {

					String doubleLineInput = doubleScanner.nextLine();

					doubleArrayLine = doubleLineInput.split(",");

					int stringToIntID = Integer.parseInt(doubleArrayLine[1].trim());

					// if toState is found, check if the patient is the same

					if ((stringToIntID == ID)
							&& (doubleArrayLine[3].trim().equals(toState.trim()))
							&& doubleArrayLine[0].trim().equals(arrayLine[0].trim())
							&& (toState.trim().equals(NextState.getNextState(fileName, fromState.trim(), type, ID)))) {

						exactOccurenciesCount++;

					}

				}
				
				doubleScanner.close();

			}
			
		}

		
		scanner.close();

		return exactOccurenciesCount;

	}

}
