package phoneyDirectory;


public class Person implements Comparable<Person> {
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String phoneyNumber;
	
	public Person() {}
	public Person(String firstName, String middleName, String lastName, Address address, String phoneyNumber) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.address = address;
			this.phoneyNumber = phoneyNumber;
	}
	
	public String getFirstName() {
		return this.firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}
	public String getLastName() {
		return this.lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	}
	public String getMiddleName() {
		if(middleName == "" || middleName == null || middleName == " ") {
		return "";
		} else {
		return this.middleName.substring(0, 1).toUpperCase() + this.middleName.substring(1) + " ";	
		}
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneyNumber() {
		return this.phoneyNumber;
	}
	public void setPhoneyNumber(String phoneyNumber) {
		this.phoneyNumber = phoneyNumber;
	}
	public static String parsePhoneNum(String phoneNum) {
		String areaCode = phoneNum.substring(0, 3);
		String prefix = phoneNum.substring(3, 6);
		String suffix = phoneNum.substring(6, 10);
		return ("("+ areaCode + ") " + prefix + "-" + suffix);
	}
	@Override
	public String toString() {
		return firstName + " " + (middleName == "" ? "" : middleName + " ") + lastName + address + "\r\n" + parsePhoneNum(phoneyNumber);
	}
	@Override
	public int compareTo(Person w) {
		return lastName.compareTo(w.getLastName());
	}
	
}
