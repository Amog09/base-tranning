package oop;

public class SchoolEnrollment {

	public static void main(String[] args) {

		Students student12 = new Students("Hulk", "Smash", "956284665");
		Students student13 = new Students("Wonder", "Woman", "352214334");
		System.out.println();
		Students manisha = new Students("Manisha", "Shrestha", "056465222");
		manisha.enroll("Maths101");
		manisha.enroll("Programing102");
		manisha.enroll("Eng101");
		manisha.enroll("History102");
		manisha.showCourses();
		manisha.showBalance();
		manisha.pay(4000);
		manisha.showBalance();
		
		

	}
}
