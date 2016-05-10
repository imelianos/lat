package AESimualtor;

import java.util.ArrayList;

import java.util.concurrent.atomic.AtomicInteger;

class EntityPatient extends Entity implements Constants {

	private TriageTypes triage = null;

	private static double[][] possibilitiesAndRoutes = new double[Constants.PatientStates.values().length][Constants.PatientStates.values().length];

	private static AtomicInteger patientid = new AtomicInteger();
		
	private int currentState;
		
	private int nextState;
		
	private ArrayList <Integer> stagesPassed = new ArrayList<Integer>(); 
	
	private ResourceNurse assignedNurse = null;
	
	private ResourceDoctor assignedDoctor = null;
	
	private EntityTypes type = null;
		
	public EntityPatient() {
				
		this.setPatientID(patientid.incrementAndGet());
		
		this.setEntityType(EntityTypes.PATIENT);
		
		this.setCurrentState(0);
				
//		this.setNextState(getRandomNextState(this.getCurrentState(),possibilitiesAndRoutes));
										
	}
	
	public void setAssignedNurse(ResourceNurse nurse) {

		this.assignedNurse=nurse;
		
	}

	public ResourceNurse getAssignedNurse() {

		return this.assignedNurse;
		
	}
	
	public void setAssignedDoctor(ResourceDoctor doctor) {

		this.assignedDoctor=doctor;
		
	}

	public ResourceDoctor getAssignedDoctor() {

		return this.assignedDoctor;
		
	}

	public TriageTypes getTriage() {

		return this.triage;

	}

	public void setTriage(TriageTypes triage) {

		this.triage = triage;

	}
	
	public int getPatientID() {
		
	    return this.id;
	    
	}
	
	public void setPatientID(int id) {
		
		this.id=id;	  
		
	}
	
	public int getCurrentState() {
		
	    return this.currentState;
	    
	}
	
	public void setCurrentState(int state) {
		
		this.currentState=state;
	
	}
	
	public void setNextState(int state) {
		
		this.nextState=state;
	
	}
	
	public int getNextState() {
		
		return this.nextState;
		
	}
	
	public void setTime(double time) {
		
		this.time=time;
		
	}	
	
	public double getTime() {
		
		return this.time;
		
	}

// 2D table[column][row]
	
	public int getRandomNextState(int currentState) {

		int nextState = 0;

		double result = Math.random() * 1.0;

		if (result <= possibilitiesAndRoutes[0][currentState]) {

			if (possibilitiesAndRoutes[0][currentState] != 0.0) {

				nextState = 0;

			}

		} else if ((result <= possibilitiesAndRoutes[1][currentState])) {

			if (possibilitiesAndRoutes[1][currentState] != 0.0) {

				nextState = 1;

			}

		} else if ((result <= possibilitiesAndRoutes[2][currentState])) {

			if (possibilitiesAndRoutes[2][currentState] != 0.0) {

				nextState = 2;

			}

		}

		else if ((result <= possibilitiesAndRoutes[3][currentState])) {

			if (possibilitiesAndRoutes[3][currentState] != 0.0) {

				nextState = 3;

			}

		}

		else if ((result <= possibilitiesAndRoutes[4][currentState])) {

			if (possibilitiesAndRoutes[4][currentState] != 0.0) {

				nextState = 4;

			}

		}

		else if ((result <= possibilitiesAndRoutes[5][currentState])) {

			if (possibilitiesAndRoutes[5][currentState] != 0.0) {

				nextState = 5;

			}

		}

		else if ((result <= possibilitiesAndRoutes[6][currentState])) {

			if (possibilitiesAndRoutes[6][currentState] != 0.0) {

				nextState = 6;

			}

		}

		else if ((result <= possibilitiesAndRoutes[7][currentState])) {

			if (possibilitiesAndRoutes[7][currentState] != 0.0) {

				nextState = 7;

			}

		}
		else if ((result <= possibilitiesAndRoutes[8][currentState])) {

			if (possibilitiesAndRoutes[8][currentState] != 0.0) {

				nextState = 8;

			}

		}
		else if ((result <= possibilitiesAndRoutes[9][currentState])) {

			if (possibilitiesAndRoutes[9][currentState] != 0.0) {

				nextState = 9;

			}

		}



		return nextState;

	}
	


	public void addToStagesPassed(int stage){
		
		this.stagesPassed.add(stage);
		
	} 
	
	public ArrayList<Integer> getStagesPassed(){
		
		return this.stagesPassed;
		
	}
	
	static double[][] getPossibilitiesAndRoutes(){
		
		return possibilitiesAndRoutes;
		
	}
	
	static void setPossibilitiesAndRoutes(double [][] possibilitiesAndRoutes){
		
		EntityPatient.possibilitiesAndRoutes=possibilitiesAndRoutes;
		
	}
	
	EntityTypes getEntityType(){
		
		return this.type;
		
	}
	
	void setEntityType(EntityTypes entityType){
		
		this.type=entityType;
		
	}
	
}
