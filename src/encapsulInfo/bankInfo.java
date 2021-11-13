package encapsulInfo;

public class bankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerInfo info=new customerInfo();
		info.setAcno(5643789);
		info.setMno(234451234);
		info.setName("Akash");
		System.out.println(info.getAcno());
		System.out.println(info.getMno());
		System.out.println(info.getName());
	}

}
