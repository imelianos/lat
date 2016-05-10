package LogAnalysisEnhanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedLoadLogForAnalysis {

	public static ArrayList<String> logToArrayList = new ArrayList<String>();

	public static void loadLog(String fileName) {

		if (logToArrayList.size() == 0) {

			File file = new File(fileName);

			try {

				Scanner scanner = new Scanner(file);

				while (scanner.hasNextLine()) {

					String lineInput = scanner.nextLine();

					logToArrayList.add(lineInput);

				}

				scanner.close();

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}

		}
		
//		System.out.rintln("Log Loaded, size : "+logToArrayList.size()+" lines.");
		
	}
	
	
	
}
