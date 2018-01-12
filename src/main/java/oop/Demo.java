package oop;

class Person {
	public String name;
	public String eMail;
	public int phoneNumber;

	void working() {
		System.out.println(name + " is working over time this week.");

	}

	void gaming() {
		System.out.println(name + " gaming add is " + eMail + ".");

	}

	void parting() {
		System.out.println("Call " + name + " on "+ phoneNumber + " to join the party.");

	}
}

public class Demo {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name= "Amogh";
		p.eMail = "Amogh@test.com";
		p.phoneNumber = 348773909;
		
		p.working();
		p.gaming();
		p.parting();

	}

}
