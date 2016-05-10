package LogAnalysisEnhanced;

import java.io.IOException;

public class EnhancedProbabilitiesStatic {
	
	public static double getPercentageEstimationOfState(String fileName, String state) throws IOException{
		
		double percentage = 0;
		
		//The intended outcome of this calculation is to find out the percentage of patients who passed each state
		//If this percentage is >100% then this means that some patients have passed more than once from this state
		
			percentage=(100*EnhancedCountOccurrencies.getCountOccurencies(fileName, state))/EnhancedCountOccurrencies.getCountOccurencies(fileName, "ARRIVAL");
		
		return percentage;
		
	}

}
