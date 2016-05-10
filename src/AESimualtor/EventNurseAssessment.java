package AESimualtor;

public class EventNurseAssessment extends Event {

	public static double meanNurseAssessment;
	
	private EntityPatient patient;

	public EventNurseAssessment(EntityPatient patient) {

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

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TRIAGE.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.NURSE_VISIT.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);
		}

		else if (patient.getNextState() == Constants.PatientStates.DOCTOR_VISIT.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.XRAY.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.MORE_TESTS.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TREATMENT.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.ADMISSION.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.DISCHARGE.ordinal()) {

			EventFreeNurse freeNurse = new EventFreeNurse(patient);

			freeNurse.executeFreeNurse((Simulator) simulator, patient);

		}

		// check if there are any patients waiting for assessment, if yes
		// schedule an assessment
		
		if (ResourceNurse.getPatientWaitingNurseSize() > 0) {

			patient = ResourceNurse.getPatientWaitingNurse();

			executeNurseAssessment(simulator, patient);
		}

	}

	void executeNurseAssessment(AbstractSimulator simulator,
			EntityPatient patient) {

		// Acquire and allocate resource

		if (ResourceNurse.getAvailableNurseSize() > 0) {

			ResourceNurse nurse = ResourceNurse.getAvailableNurse();

			patient.setAssignedNurse(nurse);

			nurse.setState(Constants.NurseStates.ASSESSING);

			patient.setCurrentState(patient.getNextState());

			patient.addToStagesPassed(patient.getCurrentState());

			patient.setNextState(patient.getRandomNextState(
					patient.getCurrentState()));

			time = ((Simulator) simulator).now()
					+ Random.exponential(EventNurseAssessment.meanNurseAssessment);

			nurse.setTime(((Simulator) simulator).now());

			//Resource Log

			String nurseLog = String.format("%s, %4d, %13f ,%18s, %17f, %18s, %12s, %s"
					
					,nurse.getResourceType()
					,nurse.getID()
					,((Simulator) simulator).now()
					,Constants.DoctorStates.values()[ nurse.getState() ]
					,time
					,""
					,""
					,""
					);
			
			eventLogger.info(nurseLog);

			// Patient Log

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

			ResourceNurse.setPatientWaitingNurse(patient);
		}

	}

}
