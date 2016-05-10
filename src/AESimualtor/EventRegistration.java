package AESimualtor;

public class EventRegistration extends Event{
			
	public static double meanRegistrationDuration;
		
	EntityPatient patient;
	
	public EventRegistration(EntityPatient patient){
		
		this.patient=patient;
		
	}

	void execute(AbstractSimulator simulator) {

		if (patient.getNextState() == Constants.PatientStates.ARRIVAL.ordinal()) {
			
			System.out.println("Cannot route from : "+patient.getCurrentState()+" to : "+patient.getNextState());
			
			return;


		} else if (patient.getNextState() == Constants.PatientStates.REGISTRATION.ordinal()) {
			
			executeRegistration((Simulator)simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TRIAGE.ordinal()) {

			EventTriage newTriage = new EventTriage(patient);
			
			newTriage.executeTriage((Simulator)simulator, patient);
			
		}

		else if (patient.getNextState() == Constants.PatientStates.NURSE_VISIT.ordinal()) {
			
			EventNurseAssessment newNurseAssessment = new EventNurseAssessment(patient);
			
			newNurseAssessment.executeNurseAssessment((Simulator)simulator,patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.DOCTOR_VISIT.ordinal()) {

			EventDoctorAssessment newDoctorAssessemnt = new EventDoctorAssessment(patient);
			
			newDoctorAssessemnt.executeDoctorAssessment((Simulator)simulator,patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.XRAY.ordinal()) {

			EventXRay newXRay = new EventXRay(patient);
			
			newXRay.executeXRay((Simulator)simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.MORE_TESTS.ordinal()) {

			EventTests newTests = new EventTests(patient);
			
			newTests.executeTests((Simulator)simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.TREATMENT.ordinal()) {

			EventTreatment newTreatment = new EventTreatment(patient);
			
			newTreatment.executeTreatment((Simulator)simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.ADMISSION.ordinal()) {

			EventAdmission newAdmission = new EventAdmission(patient);
			
			newAdmission.executeAdmission((Simulator)simulator, patient);

		}

		else if (patient.getNextState() == Constants.PatientStates.DISCHARGE.ordinal()) {

			EventDischarge newDischarge = new EventDischarge(patient);
			
			newDischarge.executeDischarge((Simulator)simulator, patient);

		}
		
	}
			
			void executeRegistration(Simulator simulator, EntityPatient patient){
				
				patient.setCurrentState(patient.getNextState());
				
				patient.addToStagesPassed(patient.getCurrentState());

				patient.setNextState(patient.getRandomNextState(patient.getCurrentState()));
				
				time = ((Simulator) simulator).now()+Random.exponential(EventRegistration.meanRegistrationDuration);
				
				patient.setTime(time);
								
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

			}

		}

	



