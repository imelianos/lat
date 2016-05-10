package LogAnalysis;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadLog {

	public void readFile(String fileName) {

		File file = new File(fileName);

		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				String lineInput = scanner.nextLine();

				System.out.println(lineInput);

			}

			scanner.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		
	}

	
}