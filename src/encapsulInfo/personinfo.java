package encapsulInfo;
import java.util.*;
public class personinfo {
	private long ano;
	String name,address,state,dob;
	long mno,adhno=12341234,adhno1=12342355;
	
	
	
	public long getAdhar() {
		return ano;
	}
	
	public void setAdhar( long ano) {
		this.ano=ano;
		
	}
	
	public void adharInfo() {
	
		
	if(adhno==ano){
		   
		   name="Shrikant Suresh Aher";
		   address="Ganhi chowk,umarkhed";
		   state="Maharashtra";
		   mno=94789234;
           dob="24/12/2000";
           System.out.println("Name:"+name+"\n"+"Address:"+address+"\n"+"State:"+state+"\n"+"Mobile No.:"+mno+"\n"+"Date of Birth:"+dob);
		
		}
	else if(ano==adhno1) {
		   
			name="Kanha sujit Garaje";
			address="vasant Nagar,umarkhed";
			state="Maharashtra";
			mno=94789234;
			dob="23/5/2000";
			System.out.println("Name:"+name+"\n"+"Address:"+address+"\n"+"State:"+state+"\n"+"Mobile No.:"+mno+"\n"+"Date of Birth:"+dob);
		}
	 else {
		    System.out.println("Invalid Number");
	 }
		 
		 }
	}


