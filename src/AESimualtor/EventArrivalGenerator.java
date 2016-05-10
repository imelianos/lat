package AESimualtor;

public class EventArrivalGenerator extends Event{
	
	private static double meanArrivalInterval;
	
	public static Double[] meanHourlyArrivalInterval =  new Double[24];
	
	public static int simulationDuration;
		
	void execute(AbstractSimulator simulator) {
			
		if (time < simulationDuration) {
			
			for(int i = 0;i<23;i++){
				
				if ((time % (24 * 60) >= (i * 60)) && (time % (24 * 60) <= ((i + 1) * 60))){

					meanArrivalInterval = meanHourlyArrivalInterval[i];}
			}
			
			EntityPatient patient = new EntityPatient();
			
			time = ((Simulator) simulator).now()+ Random.exponential(meanArrivalInterval);
									
			simulator.insert(this);

			EventArrival arrival = new EventArrival(patient);

			arrival.executeArriv((Simulator) simulator, patient);
			
		}
		
	}
		
}




