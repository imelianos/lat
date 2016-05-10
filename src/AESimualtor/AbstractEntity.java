package AESimualtor;

public abstract class AbstractEntity implements Constants{

	abstract int getID();
	
	abstract void setID(int id);
	
	abstract EntityTypes getEntityType();
	
	abstract void setEntityType(EntityTypes entityType);
	
}
