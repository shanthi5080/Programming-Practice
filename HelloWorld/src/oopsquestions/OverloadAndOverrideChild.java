package oopsquestions;


public class OverloadAndOverrideChild extends  OverloadAndOverrideExParent {

	public int speedLimit()
	    {
	        return 150;
	    }
	    public static void main(String args[])
	    {
	    	OverloadAndOverrideExParent obj = new OverloadAndOverrideExChild();
	    	int num= obj.speedLimit();
	    	System.out.println("Speed Limit is: "+num);
	    }
	}
	

