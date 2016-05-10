package LogAnalysisEnhanced;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;

public class EnhancedInterStateInterval {

	public static void getInterStateInterval(String fileName, String state, int placeInTheArray) throws IOException {
						
		double timeDifferenceBetweenOccurencies = 0;
		
		double previousOccurenceTime = 0;
		
		double runningMeanInterStateInterval = 0;
		
		double minimumInterStateInterval = 0;
		
		double maximumInterStateInterval = 0;
				
		ArrayList<Double> runningMeanInterStateIntervalArray = new ArrayList<Double>();
		
		ArrayList<Double> timeDifferenceBetweenOccurenciesArray = new ArrayList<Double>();

		int elementsPerLine = EnhancedCountLineElements.getCountLineElements(fileName);
		
		String arrayLine [] = new String [elementsPerLine];
		
		EnhancedLoadLogForAnalysis.loadLog(fileName);
		
		ArrayList<String> logArrayList = new ArrayList<String>(EnhancedLoadLogForAnalysis.logToArrayList);
		
		for (String line : logArrayList) {

			arrayLine = line.split(",");
				
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
		
		for (Double i : runningMeanInterStateIntervalArray) {
			
			System.out.printf("%s %f %n","Running mean : ",i);
			
		}
		
		

		for (Double i : timeDifferenceBetweenOccurenciesArray) {
		
			System.out.printf("%s %f %n","Differences in Occurrencies : ",i);
			
		}
		
		maximumInterStateInterval=Collections.max(timeDifferenceBetweenOccurenciesArray);
		
		minimumInterStateInterval=Collections.min(timeDifferenceBetweenOccurenciesArray);

		System.out.printf("%f %n",minimumInterStateInterval);
		
		System.out.printf("%f %n",maximumInterStateInterval);
		
	}
	


	
}
