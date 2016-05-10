package AESimualtor;

public class EventDoctorAssessment extends Event {

	public static double meanDoctorAssessment;
	
	public static Double[] meanPauseBetweenDoctorVisits;
	
	private static double meanPauseBetweenDoctorAssessments;

	private EntityPatient patient;

	public EventDoctorAssessment(EntityPatient patient) {

		this.patient = patient;

	}

	void execute(AbstractSimulator simulator) {
		
		//All routes are permitted apart from the one which points to an EventArrival
		
		if (patient.getNextState() == Constants.PatientStates.ARRIVAL.ordinal()) {

			System.out.println("Cannot route from : "
					+ patient.getCurrentState()
					+ " to : "
					+ patient.getNextState());

			return;

		} else if (patient.getNextState() == Constants.PatientStates.REGISTRATION.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TRIAGE.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.NURSE_VISIT.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);
			
		}

		else if (patient.getNextState() == Constants.PatientStates.DOCTOR_VISIT.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.XRAY.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.MORE_TESTS.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TREATMENT.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.ADMISSION.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.DISCHARGE.ordinal()) {

			EventFreeDoctor freeDoctor = new EventFreeDoctor(patient);

			freeDoctor.executeFreeDoctor((Simulator) simulator, patient);

		}
		
		// check if there are any patients waiting for assessment, if yes schedule an assessment

		if (ResourceDoctor.getPatientsWaitingDoctorAssessmentSize() > 0) {

			patient = ResourceDoctor.getPatientsWaitingDoctorAssessment();

			executeDoctorAssessment(simulator, patient);
		}

	}

	void executeDoctorAssessment(AbstractSimulator simulator, EntityPatient patient) {

		// check if Resource is available

		if (ResourceDoctor.getAvailableDoctorSize() > 0) {

			ResourceDoctor doctor = ResourceDoctor.getAvailableDoctor();

			patient.setAssignedDoctor(doctor);

			doctor.setState(Constants.DoctorStates.ASSESSING);

			patient.setCurrentState(patient.getNextState());

			patient.addToStagesPassed(patient.getCurrentState());

			patient.setNextState(patient.getRandomNextState(
					patient.getCurrentState()));
			
			for(int i = 0;i<23;i++){
			
		
			if ((((Simulator) simulator).now() % (24 * 60) >= (i * 60)) && (((Simulator) simulator).now() % (24 * 60) <= ((i + 1) * 60))){

				meanPauseBetweenDoctorAssessments = meanPauseBetweenDoctorVisits[i];}
		}
		

			time = ((Simulator) simulator).now()
					+ Random.exponential(EventDoctorAssessment.meanDoctorAssessment)
					+meanPauseBetweenDoctorAssessments;

			doctor.setTime(((Simulator) simulator).now());

			//Resource Log

			String docLog = String.format("%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"
					
					,doctor.getResourceType()
					,doctor.getID()
					,((Simulator) simulator).now()
					,Constants.DoctorStates.values()[ doctor.getState() ]
					,time
					,""
					,""
					,""
					);
			
			eventLogger.info(docLog);
			
			//Patient Log
			
			String patientLog = String.format("%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"
					
					,patient.getEntityType()
					,patient.getPatientID()
					,((Simulator) simulator).now()
					,Constants.PatientStates.values()[ patient.getCurrentState() ]
					,time
					,Constants.PatientStates.values()[ patient.getNextState() ]
					,patient.getTriage()
					,""
					);
			
			eventLogger.info(patientLog);

			simulator.insert(this);

		} else {

			ResourceDoctor.setPatientsWaitingDoctorAssessment(patient);
		}

	}
}
