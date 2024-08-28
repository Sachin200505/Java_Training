package emc_java_tutorial;


class animal{
	String name;
	int age;
	void makeSound() {
		System.out.println("Animals make sound");
	}
}

class dog extends animal{
	String breed;
	void makeSound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
	
}

class Cat extends animal{
	String color;
	void makeSound() {
		System.out.println("Cat meows");
	}
	void climb(){
		System.out.println("Cat is climbing");
	}
}
public class challenge {

	public static void main(String[] args) {
		dog d1=new dog();
		d1.name="Charlie";
		d1.age=2;
		d1.breed="Labrador";
		d1.makeSound();
		d1.fetch();
		Cat c1=new Cat();
		c1.name="Tommy";
		c1.age=3;
		c1.color="White";
		c1.makeSound();
		c1.climb();
	}

}
