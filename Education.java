public class Education {
    String degree, major;
    int research;

    public Education(String degree, String major, int research){
        this.degree=degree;
        this.major=major;
        this.research=research;
    }

    //default constructor
    public Education(){
        
    }

    //set method
    public void setDegree(String degree){
        this.degree=degree;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setResearch(int research){
        this.research=research;
    }

    //get method
    public String getDegree(){
        return degree;
    }
    public String getMajor(){
        return major;
    }
    public int getResearch(){
        return research;
    }

    public String toString(){
        String str = "Degree :" +getDegree();
        str += "\nMajor :" +getMajor();
        str += "\nResearch :" +getResearch();

        return str;
    }

}
