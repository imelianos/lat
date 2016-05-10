package LogAnalysis;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountTransitions {

	// This method checks if the user passes from the fromState to the toState -
	// NO MATTER if there are intermediate states between the ones chosen to input to the method

	public static int getCountTransitions(String fileName, String fromState, String toState) throws IOException {

		int elementsPerLine = CountLineElements.getCountLineElements(fileName);

		int occurenciesCount = 0;

		double fromOccurenceTime = 0;

		double toOccurenceTime = 0;

		int patientID = 0;

		String arrayLine[] = new String[elementsPerLine];

		String doubleArrayLine[] = new String[elementsPerLine];

		File file = new File(fileName);

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {

			String lineInput = scanner.nextLine();

			arrayLine = lineInput.split(",");

			// check if read line has the fromState, if it has, create
			// doubleScanner which scans again the log to find the to state

			if (arrayLine[3].trim().equals(fromState.trim())) {

				patientID = Integer.parseInt(arrayLine[1].trim());

				fromOccurenceTime = Double.parseDouble(arrayLine[2].trim());

				Scanner doubleScanner = new Scanner(file);

				while (doubleScanner.hasNextLine()) {

					String doubleLineInput = doubleScanner.nextLine();

					doubleArrayLine = doubleLineInput.split(",");

					int stringToIntID = Integer.parseInt(doubleArrayLine[1].trim());

					// if toState is found, check if the patient is the same

					if ((stringToIntID == patientID)
							&& (doubleArrayLine[3].trim().equals(toState.trim()))) {

						toOccurenceTime = Double.parseDouble(doubleArrayLine[2].trim());

						// if patient is the same, then check if this transition
						// happened in the order inserted, if yes, increment
						// occurencies

						if (fromOccurenceTime <= toOccurenceTime) {

							occurenciesCount++;

						}

					}

				}

				doubleScanner.close();

			}


		}
		
		scanner.close();

		
		return occurenciesCount;

	}

}
