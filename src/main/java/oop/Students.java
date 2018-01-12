package oop;

class Students {

	private static int id = 100;
	private String userId;
	private String firstName;
	private String lastName;
	private String SSN;
	private String emailAdd;
	private String state;
	private String city;
	private long phoneNumber;
	private int balance = 0;
	private static final int costOfCourse = 1000;
	private String courses = "";

	String[] course1 = { "Computer", "Calculus", "Science" };
	String[] course2 = { "Account", "Maths", "Finance" };

	// constructor
	public Students(String firstName, String lastName, String SSN) {
		id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setEmailAdd();
		setId();
	}

	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		this.balance = this.balance + costOfCourse;
		System.out
				.println("Congratulation " + getFirstName() + " you have been enrolled into the course successfully.");
		showBalance();

	}

	public void showBalance() {
		System.out.println("The totall amount in your account is $" + balance + ".");
	}

	public void showCourses() {
		System.out.println(courses + "\n");
	}

	public void getCourse1() {
		for (String selectCourse : course1) {
			System.out.print(selectCourse + "\n");
		}
	}

	public void getCourse2() {
		for (String selectCourse : course2) {
			System.out.print(selectCourse + "\n");
		}
	}

	public void setCourse1() {
		for (String selectCourse : course1) {
			System.out.print(selectCourse + "\n");

		}
	}

	public void setCourse2() {
		for (String selectCourse : course2) {
			System.out.print(selectCourse + "\n");

		}
	}

	public void getId() {
		System.out.println(userId);
	}

	public void setId() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		userId = id + "" + random + SSN.substring(5);
		// System.out.println(userId);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId() {
		System.out.println(userId);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAdd() {
		emailAdd = firstName + id + "@engineerpost.com";
		System.out.println(emailAdd);
	}

	public void pay(int amount) {
		balance = balance - amount;
		System.out.println("Your pament of $" + amount + " has been successfull submitted..");

	}

	@Override
	public String toString() {
		System.out.println("Student Details: \n");
		return "[Name: " + firstName + " " + lastName + " ]" + "\n[Student ID: " + userId + " ]" + "\n[Student email: "
				+ emailAdd + " ]";
	}

}
