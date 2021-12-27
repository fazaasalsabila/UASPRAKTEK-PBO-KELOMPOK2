public class Staff extends Employee {
	
	private double hourlyRate;
	
	//default constructor
	public Staff() {
	
	}
	
	
	public Staff(int id, String fName, String lName, String sexx, String birthDate, double rate) {
			// Call super class constructor
			super(id, fName, lName, sexx, birthDate);
			
			// Set hourly rate
			hourlyRate = rate;
	}
	
	/**
	 * @return get method sksk
	 */
	public double getHourlyRate() {
			return hourlyRate;
	}
	
	/**
	 * @param set method sksk
	 */
	public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
	}
	
	
	@Override
	public double monthlyEarning() {
			return hourlyRate*160;
	}
	
	/**
	 * @return string representation of Staff objects
	 */
	@Override
	public String toString() {
			return String.format("%s\nRate gaji per jam : %s", super.toString(), getHourlyRate());
	}
	
}