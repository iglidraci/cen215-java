public class Student {
	private String firstName, fathersName, lastName, creditCard;

	Student(String firstName, String fathersName, String lastName, String creditCard){
		setFirstName(firstName);
		setFathersName(fathersName);
		setLastName(lastName);
		setCreditCard(creditCard);
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-20s", firstName, fathersName, lastName, creditCard);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}
