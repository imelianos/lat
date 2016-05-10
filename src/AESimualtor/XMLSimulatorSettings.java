package AESimualtor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class XMLSimulatorSettings {
	
	File file = new File("./settings/simulatorSettings.xml");

	
	public String loadXML(String key) {
		
		String value = null;
		
		try {
			
			FileInputStream fileInput = new FileInputStream(file);
			
			Properties properties = new Properties();
			
			properties.loadFromXML(fileInput);
			
			fileInput.close();
			
			value = properties.getProperty(key);
			
			System.out.println("XML read :"+key + ": " + value);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException s) {
			
			s.printStackTrace();

		}
		
		return value;

	}
	
	public void writeToXML(String numberOfNurses,
						String numberOfDoctors,
						String meanArrivalStallTime,
						String meanRegistrationDuration,
						String meanTriageDuration,
						String meanNurseVisitDuration,
						String meanDoctorVisitDuration,
						String meanXrayDuration,
						String meanOtherTestsDuration,
						String meanTreatmentDuration,
						String meanHourlyArrivalInterval,
						String meanPauseBetweenDoctorVisits,
						String transitions_0,
						String transitions_1,
						String transitions_2,
						String transitions_3,
						String transitions_4,
						String transitions_5,
						String transitions_6,
						String transitions_7,
						String transitions_8,
						String transitions_9						
						){

		try {
			
			Properties properties = new Properties();
			
			properties.setProperty("numberOfNurses", numberOfNurses);
			
			System.out.println("Nurses : "+numberOfNurses);

			properties.setProperty("numberOfDoctors", numberOfDoctors);
			
			properties.setProperty("meanArrivalStallTime", meanArrivalStallTime);

			properties.setProperty("meanRegistrationDuration", meanRegistrationDuration);

			properties.setProperty("meanTriageDuration", meanTriageDuration);

			properties.setProperty("meanNurseVisitDuration", meanNurseVisitDuration);

			properties.setProperty("meanDoctorVisitDuration", meanDoctorVisitDuration);
			
			properties.setProperty("meanXrayDuration", meanXrayDuration);

			properties.setProperty("meanOtherTestsDuration", meanOtherTestsDuration);

			properties.setProperty("meanTreatmentDuration", meanTreatmentDuration);

			properties.setProperty("meanHourlyArrivalInterval", meanHourlyArrivalInterval);

			properties.setProperty("meanPauseBetweenDoctorVisits", meanPauseBetweenDoctorVisits);

			properties.setProperty("0", transitions_0);
			
			properties.setProperty("1", transitions_1);

			properties.setProperty("2", transitions_2);

			properties.setProperty("3", transitions_3);

			properties.setProperty("4", transitions_4);

			properties.setProperty("5", transitions_5);

			properties.setProperty("6", transitions_6);

			properties.setProperty("7", transitions_7);

			properties.setProperty("8", transitions_8);

			properties.setProperty("9", transitions_9);

			FileOutputStream fileOut = new FileOutputStream(file);
			
			properties.storeToXML(fileOut, "Care when changing this file");
			
			fileOut.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
