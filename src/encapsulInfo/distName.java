package encapsulInfo;

public class distName extends distInfo{
	private String n;
	int pincode,passingno,muncipal,taluka;
	String state,university;
	
	public String getName() {
		return n;
	}
    public void setName(String n) {
    	this.n=n;
    }
    public void Info() {
    	state="Maharashtra";
    	university="Rashtrasant tukadoji maharaj,Univarsity";
    	pincode=445206;
    	muncipal=6;
    	taluka=16;
    	passingno=29;
    	System.out.println("State:"+state);
    	System.out.println("Univarsity:"+university);
    	System.out.println("Pincode:"+pincode);
    	System.out.println("Muncipal:"+muncipal);
    	System.out.println("Taluka:"+taluka);
    	System.out.println("passing:"+passingno);
    }
}
