import java.io.Serializable;

public class Author implements Serializable {
	
	private static final long serialVersionUID = -6015536657969848359L;
	private String firstName;
	private String lastName;
	private Gender gender;
	public Author(String firstName, String lastName, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}