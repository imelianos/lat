package LogAnalysis;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class InterStateInterval {

	public static void getInterStateInterval(String fileName, String state, int placeInTheArray) throws IOException {

		File file = new File(fileName);
						
		double timeDifferenceBetweenOccurencies = 0;
		
		double previousOccurenceTime = 0;
		
		double runningMeanInterStateInterval = 0;
		
		double minimumInterStateInterval = 0;
		
		double maximumInterStateInterval = 0;
				
		ArrayList<Double> runningMeanInterStateIntervalArray = new ArrayList<Double>();
		
		ArrayList<Double> timeDifferenceBetweenOccurenciesArray = new ArrayList<Double>();

		int elementsPerLine = CountLineElements.getCountLineElements(fileName);
		
		String arrayLine [] ;
		
		try {
			
			Scanner scanner = new Scanner(file);
			
			arrayLine = new String [elementsPerLine];
						
			while (scanner.hasNextLine()) {

				String lineInput = scanner.nextLine();
				
				arrayLine = lineInput.split(",");
				
				if(arrayLine[placeInTheArray].trim().equals(state.trim())){
										
					double stringToDouble = Double.parseDouble(arrayLine[2]);
					
					System.out.println("current read : "+stringToDouble+" previous read :  "+previousOccurenceTime);

					if (previousOccurenceTime!=0){
						
						timeDifferenceBetweenOccurencies =  stringToDouble - previousOccurenceTime;
					
						timeDifferenceBetweenOccurenciesArray.add(timeDifferenceBetweenOccurencies);

						runningMeanInterStateInterval = timeDifferenceBetweenOccurencies/ ((runningMeanInterStateIntervalArray.size() + 2));

						runningMeanInterStateIntervalArray.add(runningMeanInterStateInterval);
					
					}
					
					previousOccurenceTime = stringToDouble;
																	
				}
							
		}
			
			scanner.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}

		
		
		
		for (Double i : runningMeanInterStateIntervalArray) {
			
			System.out.println("Running mean : "+i);
			
		}
		
		

		for (Double i : timeDifferenceBetweenOccurenciesArray) {
		
			System.out.println("Differences in Occurrencies : "+i);
			
		}
		
		maximumInterStateInterval=Collections.max(timeDifferenceBetweenOccurenciesArray);
		
		minimumInterStateInterval=Collections.min(timeDifferenceBetweenOccurenciesArray);

		System.out.printf("%f %n",minimumInterStateInterval);
		
		System.out.printf("%f %n",maximumInterStateInterval);
		
	}
	


	
}
