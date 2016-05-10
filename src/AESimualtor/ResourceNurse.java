package AESimualtor;

import java.util.Comparator;

import java.util.PriorityQueue;

import java.util.concurrent.atomic.AtomicInteger;

class ResourceNurse extends Resource implements Constants {

	private  static Comparator<Resource> nurseTimeComparator = new ResourceTimeComparator();

 	private static PriorityQueue<ResourceNurse> availableNurse = new PriorityQueue<ResourceNurse>(10000,nurseTimeComparator);
 	 
	private static Comparator<EntityPatient> patientTriageAndTimeComparator = new TriageAndTimeComparator();

	private static PriorityQueue<EntityPatient> patientsWaitingNurse = new PriorityQueue<EntityPatient>(100,patientTriageAndTimeComparator);
	
	private static AtomicInteger nurseid = new AtomicInteger();

	private int id;

	private NurseStates state;
	
	private ResourceTypes type;
		
// Nurse Constructor	

	public ResourceNurse() {
						
		this.setID(nurseid.incrementAndGet());
		
		setResourceType(ResourceTypes.NURSE);
		
		ResourceNurse.addToAvailableNurse(this);
				
		System.out.println("Available Nurses :"+availableNurse.size()+ " id :"+id+ " "+getState()+ " "+time);

	}
	
// static methods for all Nurses	

	public static ResourceNurse getAvailableNurse() {

		return availableNurse.poll();

	}

	public static ResourceNurse readAvailableNurse() {

		return availableNurse.peek();

	}
	
	public static void addToAvailableNurse(ResourceNurse nurse) {
		
		nurse.setState(Constants.NurseStates.IDLE);
		
		availableNurse.add(nurse);

	}

	public static int getAvailableNurseSize() {

		return availableNurse.size();
	}
	
	public static EntityPatient getPatientWaitingNurse() {

		return patientsWaitingNurse.poll();

	}

	public static EntityPatient readPatientWaitingNurse() {

		return patientsWaitingNurse.peek();

	}

	public static void setPatientWaitingNurse(EntityPatient patient) {
			
		ResourceNurse.patientsWaitingNurse.add(patient);
		
	}

	public static int getPatientWaitingNurseSize() {

		return patientsWaitingNurse.size();
	}

	
// abstract implementations, public and private methods for instances of Nurses	
	

	int getID() {
		
		return this.id;
	}

	void setID(int id) {
		
		this.id=id;			
	}

	void setTime(double time) {
		
		this.time=time;		

	}

	double getTime() {

		return this.time;
		
	}
	
	
	
	void setState(NurseStates state) {
		
		this.state = state;		
	}

	int getState() {
		
		return this.state.ordinal();

	}

	ResourceTypes getResourceType() {

		return this.type;
	}

	void setResourceType(ResourceTypes resourceType) {

		this.type=resourceType;
		
	}
	
}
