package day6.practice;

public class Trainer extends 	Person {
private String session;
private String desig;
private String batchNo;
public Trainer(int pid,String name,String city,String session,String desig,String batchNo) {
	super(pid,name,city);
	this.session = session;
	this.desig = desig;
	this.batchNo = batchNo;
	
}
public String getSession() {
	return session;
}
public void setSession(String session) {
	this.session = session;
}
public String getDesig() {
	return desig;
}
public void setDesig(String design) {
	this.desig = desig;
}
public String getBatchNo() {
	return batchNo;
}
public void setBatchNo(String batchNo) {
	this.batchNo = batchNo;
} 
@Override
public String toString() {
	return "Trainer [Trainer id:" +super.getPid() 
			+", Trainer Name:" +super.getName() 
			+", Trainer City:" +super.getCity() 
			+", session=" + session  
			+", desig=" + desig 
			+", batchNo=" + batchNo + "]";
}

}
