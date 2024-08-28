package emc_java_tutorial;

class dad{
	int money=2000;
}
class son extends dad{
	
}

class grandson extends son{
	
}

public class MainClass {

	public static void main(String[] args) { 
          grandson s1=new grandson();
          System.out.println(s1.money);
	}

}
