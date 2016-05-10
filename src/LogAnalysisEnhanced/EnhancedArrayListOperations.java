package LogAnalysisEnhanced;

import java.util.ArrayList;

import java.util.Collections;

public class EnhancedArrayListOperations {
	
	public static double getMinimumFromArray(ArrayList <Double> arrayListInput){
		
		double minimumValue = 0;
		
		minimumValue = Collections.min(arrayListInput);
		
		return minimumValue;
	
	}
	
	public static double getMaximumFromArray(ArrayList <Double> arrayListInput){
		
		double maximumValue = 0;
		
		maximumValue = Collections.max(arrayListInput);
		
		return maximumValue;
	
	}
	
	public static double getRangeFromArray(ArrayList <Double> arrayListInput){
		
		double range = 0;
		
		range = getMaximumFromArray(arrayListInput) - getMinimumFromArray(arrayListInput);
		
		return range;
		
	}

}
