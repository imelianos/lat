package AESimualtor;

public abstract class AbstractResource implements Constants{
	
	abstract int getID();
	
	abstract void setID(int id);
		
	abstract void setTime(double time);
	
	abstract double getTime();
	
	abstract ResourceTypes getResourceType();
	
	abstract void setResourceType(ResourceTypes resourceType);

}
