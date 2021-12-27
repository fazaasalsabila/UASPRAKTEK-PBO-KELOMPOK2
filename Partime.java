public class Partime extends Staff {
	
	private double hoursWeekly;
	
	public Partime() {
			hoursWeekly = 0;
	}
	
	public Partime(int id, String fName, String lName, String sexx, String birthDate, double rate,  double weeklyHours) {
			super(id, fName, lName, sexx, birthDate, rate);
			hoursWeekly = weeklyHours;
	}

	
	


	// get method xixixi
	public double getHoursWeekly() {
		return hoursWeekly;
	}

	//set method xixixi
	public void setHoursWeekly(double hoursWeekly) {
		this.hoursWeekly = hoursWeekly;
	}

	
	@Override
	public double monthlyEarning(){
		return super.getHourlyRate()*hoursWeekly*4;
	}

	@Override
	public String toString() {
			String str = "ID : " + getID() + "\n";
			str += "Nama Karyawan : " + getFirstName() + " " + getLastName() + "\n";
			str += "Jenis Kelamin : " + getSex() ;
			str += "\nTanggal lahir : " + getDate();
			str += "\nGaji per jam : " + getHourlyRate();
			str += "\nJam kerja dalam seminggu : " + getHoursWeekly();
			return str;
	}
}