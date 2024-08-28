package emc_java_tutorial;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}
class Employee extends Person
{
	Employee(String name){
	
	super(name);
	int employeeId;
}
}


public class Super {

	public static void main(String[] args) {
     Employee emp=new Employee("sachin");
     System.out.println(emp.name);
	}

}