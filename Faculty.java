
public class Faculty extends Employee {

    Level level;

    Education education;

    public Faculty(int id, String fName, String lName, String sexx, String birthDate, Level level, Education education) {
        super(id, fName, lName, sexx, birthDate); 

        this.level = level;

        this.education = education;

    }

    public Faculty() {

        /* default constructor */

    }

    @Override

    public double monthlyEarning() {

        if (level == Level.AS) {

            return EmployeeInfo.FACULTY_MONTHLY_SALARY;/** return the salary of Assistant proff */

        } else if (level == Level.AO) {

            return (1.5 * EmployeeInfo.FACULTY_MONTHLY_SALARY); /** return the salary of Assoc proff */

        } else if (level == Level.FU) {

            return (2 * EmployeeInfo.FACULTY_MONTHLY_SALARY);/** return the salary of full time proff */

        }

        return 0;

    }

    enum Level {
        AS,

        AO,

        FU
    }

    public Level getLevel() {

        return level;

    }

    public void setLevel(Level level) {

        this.level = level;

    }

    public Education getEducation() {

        return education;

    }

    public void setEducation(Education education) {

        this.education = education;

    }

    public String toString() {

        String role = "";

        if (level == Level.AS) {

            role = "Assistant Professor";

        } else if (level == Level.AO) {

            role = "Associate Professor";

        } else if (level == Level.FU) {

            role = "Full Professor";



			
        }

        String str = super.toString() + "\n" + role + "\n"+ getEducation();

        return str;

    }
}
