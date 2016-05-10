package LogAnalysis;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;

public class NextState {

	public static String getNextState(String fileName, String state, String type, int ID) throws IOException {

		String nextState = null;

		int elementsPerLine = CountLineElements.getCountLineElements(fileName);

		String arrayLine[] = new String[elementsPerLine];

		String doubleArrayLine[] = new String[elementsPerLine];

		try {

			File file = new File(fileName);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				String lineInput = scanner.nextLine();

				arrayLine = lineInput.split(",");

				int firstScanID = Integer.parseInt(arrayLine[1].trim());

				if ((arrayLine[0].trim().equals(type))
						&& (firstScanID == ID)
						&& (arrayLine[3].trim().equals(state))) {

					double timeOfOccurrence = Double.parseDouble(arrayLine[2].trim());

					try {

						File doubleFile = new File(fileName);

						Scanner doubleScanner = new Scanner(doubleFile);

						while (doubleScanner.hasNextLine()) {

							String doubleLineInput = doubleScanner.nextLine();

							doubleArrayLine = doubleLineInput.split(",");

							int secondScanID = Integer.parseInt(doubleArrayLine[1].trim());

							if ((doubleArrayLine[0].trim().equals(type))
									&& (secondScanID == firstScanID)
									&& !(doubleArrayLine[3].trim()
											.equals(state))) {

								double secondTimeOfOccurrence = Double
										.parseDouble(doubleArrayLine[2].trim());

								if (timeOfOccurrence < secondTimeOfOccurrence) {

									nextState = doubleArrayLine[3].trim();

									return nextState;

								}

							}

						}

						doubleScanner.close();

					} catch (FileNotFoundException e) {

						e.printStackTrace();

					}

				}

			}
			
			scanner.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		return nextState;

	}

}
