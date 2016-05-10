package LogAnalysis;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

public class CountLineElements {

	public static int getCountLineElements(String fileName) throws IOException {

		int elements = 0;

		File file = new File(fileName);

		Scanner scan = new Scanner(file);

		if (scan.hasNextLine()) {

			String line = scan.nextLine();

			for (int i = 0; i < line.length(); i++) {

				if (line.charAt(i) == ',') {

					elements++;

				}

			}

		}

		scan.close();

		return elements;

	}

}
