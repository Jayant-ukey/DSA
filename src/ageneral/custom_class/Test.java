package ageneral.custom_class;

class Human{
	
}

class Doctor extends Human{
	
}

class Animal{
	
}

class Dog extends Animal{
	
}

public class Test {

	//If you want to restrict it upto Human only then in generic method we can achieve it by extending required class
	public <T extends Human> void printInfo(T anyObj) {
//		System.out.println("You are human/animal");
		System.out.println("You are human");

	}
	
	public static void main(String[] args) {
		Test t = new Test();
//		As generic method is now extending Human class only
//		t.printInfo(new Dog());
		t.printInfo(new Human());
		t.printInfo(new Doctor());

	}
}
