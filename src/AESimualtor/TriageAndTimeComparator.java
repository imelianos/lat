package AESimualtor;

import java.util.Comparator;

public class TriageAndTimeComparator implements Comparator<EntityPatient> {

	  public int compare(EntityPatient patient1, EntityPatient patient2) {
		  
		 Integer x = patient1.getTriage().ordinal();
		 
		 Integer y = patient2.getTriage().ordinal();
		 
		 int compareTriage = x.compareTo(y);
		 
	     if (compareTriage != 0) {
	    	 
	        return compareTriage;
	        
	     } else {
	    	 
	       return Double.compare(patient1.getTime(), patient2.getTime());
	       
	     }
	  }
	}