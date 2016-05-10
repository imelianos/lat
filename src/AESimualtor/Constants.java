package AESimualtor;

public interface Constants {

	enum PatientStates {
		
		ARRIVAL,
		REGISTRATION,
		TRIAGE,
		NURSE_VISIT,
		DOCTOR_VISIT,
		XRAY,
		MORE_TESTS,
		TREATMENT,
		ADMISSION,
		DISCHARGE;

	}
	
	enum DoctorStates{
		
		IDLE,
		ASSESSING,
		TREATING;
		
	}
	
	enum NurseStates{
		
		IDLE,
		ASSESSING;
		
	}
	
	enum TriageTypes{
		
        RED,
        ORANGE,
        YELLOW,
        BLUE,
        GREEN;

    }
	
	enum EntityTypes{
		
		PATIENT;
		
	}
	
	enum ResourceTypes{
		
		NURSE,
		DOCTOR;
	}
	
}
