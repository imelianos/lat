package AESimualtor;

public class EventTreatment extends Event{
	
	static double meanTreatmentDuration;
		
	EntityPatient patient;

public EventTreatment(EntityPatient patient){
		
		this.patient=patient;
		
	}

	void execute(AbstractSimulator simulator) {
		
		if (patient.getNextState() == Constants.PatientStates.ADMISSION.ordinal()) {
			
			EventFreeDoctor freeDoc = new EventFreeDoctor(patient);
			
			freeDoc.executeFreeDoctor((Simulator)simulator, patient);

	}
		
		else if (patient.getNextState() == Constants.PatientStates.DISCHARGE.ordinal()) {
			
			EventFreeDoctor freeDoc = new EventFreeDoctor(patient);
			
			freeDoc.executeFreeDoctor((Simulator)simulator, patient);

	}
		
		if (ResourceDoctor.getPatientsWaitingDoctorTreatmentSize() > 0) {

			patient = ResourceDoctor.getPatientsWaitingDoctorTreatment();

			executeTreatment(simulator, patient);
		}

		
	}
			
	void executeTreatment(AbstractSimulator simulator, EntityPatient patient) {

		if (ResourceDoctor.getAvailableDoctorSize() > 0) {

			ResourceDoctor doctor = ResourceDoctor.getAvailableDoctor();

			patient.setAssignedDoctor(doctor);

			doctor.setState(Constants.DoctorStates.TREATING);

			patient.setCurrentState(patient.getNextState());

			patient.addToStagesPassed(patient.getCurrentState());

			patient.setNextState(patient.getRandomNextState(patient.getCurrentState()));

			time = ((Simulator) simulator).now()+ Random.exponential(EventTreatment.meanTreatmentDuration);

			doctor.setTime(((Simulator) simulator).now());

			// Resource Log

			String docLog = String.format(
					"%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"

					, doctor.getResourceType()
					, doctor.getID()
					, ((Simulator) simulator).now()
					, Constants.DoctorStates.values()[doctor.getState()]
					, time
					, ""
					, ""
					, "");

			eventLogger.info(docLog);

			// Patient Log

			String patientLog = String
					.format("%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"

					, patient.getEntityType()
					, patient.getPatientID()
					, ((Simulator) simulator).now()
					, Constants.PatientStates.values()[patient.getCurrentState()]
					, time
					, Constants.PatientStates.values()[patient.getNextState()], patient.getTriage()
					, ""
					);

			eventLogger.info(patientLog);

			simulator.insert(this);

		} else {

			ResourceDoctor.setPatientsWaitingDoctorTreatment(patient);
		}

	}

}
		
	