package emc_java_tutorial;

abstract class vehicle{
	abstract void speed() ;
	void brand() {
		System.out.println("Ninja brand");
	}
}
class bike extends  vehicle{
	void speed()
	{
		System.out.println("302km/hr");
	}
}




public class abstractClassabstractMethod {

	public static void main(String[] args) {

	}

}
