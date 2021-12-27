
public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String sex;
	private String date;
	private int ID;
	
	//default constructor
	public Employee() {
			
	}
	

	public Employee(int id, String fName, String lName, String sexx, String birthDate) {
			this.firstName = fName;
			this.lastName = lName;
			this.ID = id;
			this.sex = sexx;
			this.date = birthDate;

			
	}
	@Override
	public String toString() {
			return String.format("ID : %s\nNama Karyawan: %s %s\nJenis Kelamin : %s\nTanggal Lahir : %s", ID, firstName, lastName, sex, date);
	}
	
	//set method
	public void setID(int id) {
			ID = id;
	}

	public void setFirstName(String firstName) {
			this.firstName = firstName;
	}
	
	
	public void setLastName(String lastName) {
			this.lastName = lastName;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDate(String date) {
		this.date = date;
	}

	//get method
	
	public int getID() {
			return ID;
	}
	

	public String getFirstName() {
			return firstName;
	}
	
	public String getLastName() {
			return lastName;
	}

	public String getSex() {
		return sex;
	}

	public String getDate() {
		return date;
	}
	
	
	 // Abstract method untuk returns the monthly earning.
	 
	public abstract double monthlyEarning();
}