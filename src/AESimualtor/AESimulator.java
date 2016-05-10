package AESimualtor;
import java.io.IOException;

import org.apache.log4j.Logger;


public class AESimulator extends Simulator {

    public void start() throws IOException {
     	
    	final Logger universalLogger = (Logger.getLogger(Logger.class));
    			
        events = new ListQueue();
        
        XMLSimulatorSettings xmlSettings =  new XMLSimulatorSettings();
        
        //XML entry - meanHourlyArrivalInterval
        
        String meanHourlyArrivalIntervalXML = xmlSettings.loadXML("meanHourlyArrivalInterval");
        
        //CAREFUL, String array has one element more than the double array and that happens because of the plit
    
        String [] stringArrivalInterval = new String[getNumberOfPlacesInTheArray(meanHourlyArrivalIntervalXML)];
        
        stringArrivalInterval = meanHourlyArrivalIntervalXML.split(",");
        
        Double [] doubleArrivalInterval =  new Double[stringArrivalInterval.length];
		
		for (int i = 0; i<stringArrivalInterval.length; i++){
			
			doubleArrivalInterval[i]=Double.parseDouble(stringArrivalInterval[i]);
		
		}	
                
        EventArrivalGenerator.meanHourlyArrivalInterval = doubleArrivalInterval;
        
        //XML entry - meanPauseBetweenDoctorVisits
        
        String meanPauseBetweenDoctorVisitsXML = xmlSettings.loadXML("meanPauseBetweenDoctorVisits");

        String [] stringPauseBetweenDoctorVisits = new String[getNumberOfPlacesInTheArray(meanPauseBetweenDoctorVisitsXML)];
        
        stringPauseBetweenDoctorVisits = meanPauseBetweenDoctorVisitsXML.split(",");
        
        Double [] doublePauseBetweenDoctorVisits =  new Double[stringPauseBetweenDoctorVisits.length];
		
		for (int i = 0; i<stringPauseBetweenDoctorVisits.length; i++){
			
			doublePauseBetweenDoctorVisits[i] = Double.parseDouble(stringPauseBetweenDoctorVisits[i]);
		
		}	
        
        EventDoctorAssessment.meanPauseBetweenDoctorVisits = doublePauseBetweenDoctorVisits;

        //XML entry - meanPauseBetweenDoctorVisits        

        EventArrival.meanArrivalStallTime = Double.valueOf(xmlSettings.loadXML("meanArrivalStallTime"));
        
        EventRegistration.meanRegistrationDuration = Double.valueOf(xmlSettings.loadXML("meanRegistrationDuration"));

        EventTriage.meanTriageDuration = Double.valueOf(xmlSettings.loadXML("meanTriageDuration"));
        
        EventNurseAssessment.meanNurseAssessment = Double.valueOf(xmlSettings.loadXML("meanNurseVisitDuration"));
    	
        EventDoctorAssessment.meanDoctorAssessment = Double.valueOf(xmlSettings.loadXML("meanDoctorVisitDuration"));
    	
        EventXRay.meanXrayInterval = Double.valueOf(xmlSettings.loadXML("meanXrayDuration"));
    	
        EventTests.setMeanTestsDuration(Double.valueOf(xmlSettings.loadXML("meanOtherTestsDuration")));
    	
        EventTreatment.meanTreatmentDuration = Double.valueOf(xmlSettings.loadXML("meanTreatmentDuration"));
    	
        EntityPatient.setPossibilitiesAndRoutes(getPossibilitiesAndRoutes(xmlSettings));
                
        //Logger assignement to the events
        
        Event.eventLogger = universalLogger;
        
        int numberOfNurses = Integer.valueOf(xmlSettings.loadXML("numberOfNurses"));
        
        int numberOfDoctors = Integer.valueOf(xmlSettings.loadXML("numberOfDoctors"));
        
        for (int i=1; i<=numberOfNurses;i++){

            ResourceNurse nurse = new ResourceNurse();
            
            nurse.setTime(0.0);
            
        }
        
        for (int i=1; i<=numberOfDoctors;i++){

        	ResourceDoctor doctor = new ResourceDoctor();
        	
        	doctor.setTime(0.0);
        
        }
        
		System.out.println("Simulator Running for : "+EventArrivalGenerator.simulationDuration+ " minutes.");
        
		String ConsoleHeader = String.format("%s %8s %16s %20s %16s %16s %16s %8s"
				
				,"TYPE"
				,"ID"
				,"CURRENT_TIME"
				,"CURRENT_STATE"
				,"NEXT_TIME"
				,"NEXT_STATE"
				,"TRIAGE"
				,"ROUTE"
				);
		
		System.out.println(ConsoleHeader);
		
		
        EventArrivalGenerator firstArrival = new EventArrivalGenerator();
                                                
        //we set the starting time of the simulator
        //The reason it is set to 1.0 is to demonstrate the fact that time will represent real time in life, as a result a time and date
        //so it cannot be 0 but set to a specific value
        firstArrival.time=1.0;
        	
        insert(firstArrival);  
                        
		doAllEvents();  
        
    }
    
	private int getNumberOfPlacesInTheArray(String inputString){
		
		int elements = 0;
		
		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == ',') {

				elements++;

			}

		}

	return elements;
	
	}
	
	private double [][] getPossibilitiesAndRoutes(XMLSimulatorSettings xmlSettings){
		
		double[][] possibilitiesAndRoutes = new double[Constants.PatientStates.values().length][Constants.PatientStates.values().length];

		for (int i = 0; i < Constants.PatientStates.values().length; i++) {

			String inputString = xmlSettings.loadXML(String.valueOf(i));

			String[] inputStringArray = new String[getNumberOfPlacesInTheArray(inputString)];

			inputStringArray = inputString.split(",");

			Double[] inputDoubleStringArray = new Double[inputStringArray.length];

			for (int j = 0; j < inputStringArray.length; j++) {

				inputDoubleStringArray[j] = Double.parseDouble(inputStringArray[j]);

			}

			for (int k = 0; k < Constants.PatientStates.values().length; k++) {

				possibilitiesAndRoutes[k][i] = inputDoubleStringArray[k];

			}

		}

		return possibilitiesAndRoutes;

	}
	
}