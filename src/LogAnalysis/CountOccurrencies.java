package LogAnalysis;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;


public class CountOccurrencies {

	public static int getCountOccurencies(String fileName, String state) throws IOException {

		File file = new File(fileName);

		int countOfOccurencies = 0;

		int lineElements = CountLineElements.getCountLineElements(fileName);

		String arrayLine[];

		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				arrayLine = new String[lineElements];

				String lineInput = scanner.nextLine();

				arrayLine = lineInput.split(",");

				if (arrayLine[3].trim().equals(state.trim())) {

					countOfOccurencies++;

				}
				
			}
			
			scanner.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		
		return countOfOccurencies;

	}

}
