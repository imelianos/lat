package AESimualtor;

public class EventDischarge extends Event{
			
	@SuppressWarnings("unused")
	private EntityPatient patient;

	public EventDischarge(EntityPatient patient){
		
		this.patient=patient;
		
	}

	void execute(AbstractSimulator simulator) {

		// No body here because EventAdmission and EventDischarge are the last events

	}

	void executeDischarge(Simulator simulator, EntityPatient patient) {

		time = ((Simulator) simulator).now();
		
		patient.setCurrentState(patient.getNextState());

		patient.addToStagesPassed(patient.getCurrentState());
		
		String route = "";
		
		for (Integer i : patient.getStagesPassed()) {
			
			route += (i + "-");
			
		}

		String printLog = String.format("%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"
				
				,patient.getEntityType()
				,patient.getPatientID()
				,((Simulator) simulator).now()
				,Constants.PatientStates.values()[ patient.getCurrentState() ]
				,time
				,Constants.PatientStates.values()[ patient.getNextState() ]
				,patient.getTriage()
				,route
				);
		
		eventLogger.info(printLog);

	}

}
		
	