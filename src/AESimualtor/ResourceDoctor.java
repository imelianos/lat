package AESimualtor;
import java.util.Comparator;
import java.util.PriorityQueue;

import java.util.concurrent.atomic.AtomicInteger;

class ResourceDoctor extends Resource implements Constants {

	private  static Comparator<Resource> doctorTimeComparator = new ResourceTimeComparator();

 	private static PriorityQueue<ResourceDoctor> availableDoctor = new PriorityQueue<ResourceDoctor>(100,doctorTimeComparator);
 	 
	private static Comparator<EntityPatient> patientTriageAndTimeComparator = new TriageAndTimeComparator();

	private static PriorityQueue<EntityPatient> patientsWaitingDoctorAssessment = new PriorityQueue<EntityPatient>(100,patientTriageAndTimeComparator);
	
	private static PriorityQueue<EntityPatient> patientsWaitingDoctorTreatment = new PriorityQueue<EntityPatient>(100,patientTriageAndTimeComparator);
	
	private static AtomicInteger doctorid = new AtomicInteger();

	private DoctorStates state;
	
	private ResourceTypes type;
		
// ResourceDoctor Constructor	

	public ResourceDoctor() {
						
		this.setID(doctorid.incrementAndGet());
		
		setResourceType(ResourceTypes.DOCTOR);
		
		ResourceDoctor.addToAvailableDoctor(this);
				
		System.out.println("Available Doctors :"+availableDoctor.size()+ " id :"+id+ " "+getState()+ " "+time);

	}
	
// static methods for all Doctors	

	public static ResourceDoctor getAvailableDoctor() {

		return availableDoctor.poll();

	}

	public static ResourceDoctor readAvailableDoctor() {

		return availableDoctor.peek();

	}


	public static int getAvailableDoctorSize() {

		return availableDoctor.size();
		
	}
	
	public static void addToAvailableDoctor(ResourceDoctor doctor) {
		
		doctor.setState(Constants.DoctorStates.IDLE);
		
		availableDoctor.add(doctor);

	}

//patientsWaitingDoctorAssessment methods
	
	public static EntityPatient getPatientsWaitingDoctorAssessment() {

		return patientsWaitingDoctorAssessment.poll();

	}

	public static EntityPatient readPatientsWaitingDoctorAssessment() {

		return patientsWaitingDoctorAssessment.peek();

	}

	public static void setPatientsWaitingDoctorAssessment(EntityPatient patient) {
		
		ResourceDoctor.patientsWaitingDoctorAssessment.add(patient);

	}

	public static int getPatientsWaitingDoctorAssessmentSize() {

		return patientsWaitingDoctorAssessment.size();
		
	}
	
	//patientsWaitingDoctorTreatment methods
	
	public static EntityPatient getPatientsWaitingDoctorTreatment() {

		return patientsWaitingDoctorTreatment.poll();

	}

	public static EntityPatient readPatientsWaitingDoctorTreatment() {

		return patientsWaitingDoctorTreatment.peek();

	}

	public static void setPatientsWaitingDoctorTreatment(EntityPatient patient) {

		ResourceDoctor.patientsWaitingDoctorTreatment.add(patient);

	}

	public static int getPatientsWaitingDoctorTreatmentSize() {

		return patientsWaitingDoctorTreatment.size();
	}

// abstract implementations, public and private methods for instances of Doctors	
	
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

	void setState(DoctorStates state) {
		
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
