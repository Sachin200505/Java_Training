package emc_java_tutorial;

public class demo {
	
	String myname;
	
	void setName(String myname) {
		this.myname=myname;
		
	}

	public static void main(String[] args) {
		demo obj=new demo();
		obj.setName("Sachin");
		System.out.println(obj.myname);

	}

}
