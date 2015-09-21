package generalquestions;

public class AccessModifierEx extends AccessModifierExParent {

	int ssn;
	String name;
	private void getSSN(String name){
		//return ssn;
		
	}
	
	public void getAddress(String name){
	
	this.name =name;
	}
	//default int getName(int ssn){}
	
	//protected void getAge(){}

	
	public static void main(String[] args){
		 AccessModifierEx ame =new  AccessModifierEx();
		 ame.getAge();
		 
		 
	}
}
