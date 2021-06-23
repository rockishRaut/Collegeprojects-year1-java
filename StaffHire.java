
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire 
{
    //Creating a private variables of StaffHireClass
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    //A constructor is called for StaffHire class
    public StaffHire (int vacancyNumber, String designation, String jobType){
    this.vacancyNumber = vacancyNumber;
    this.designation = designation;
    this.jobType = jobType;
    }
    // Using getter method for vacancyNumber
    public int getVacancyNumber(){
    return vacancyNumber;
    }
    // Using getter method for designation
    public String getDesignation(){
    return designation;
    }
    // Using getter method for jobType
    public String getJobType(){
    return jobType;
    }
    //Using Setter method for vacancyNumber
    public void setVacancyNumber(int vacancyNumber){
    this.vacancyNumber = vacancyNumber; 
    }
    //Using Setter method for Designation
    public void setDesignation(String designation){
    this.designation = designation;
    }
    //Using Setter method for jobType
    public void setJobType(String jobType){
    this.jobType = jobType;
    }
    // using display method to show the attributes of StaffHire class
    public void display(){
    System.out.println("vacancy number = "+ vacancyNumber);
    System.out.println("designation = "+ designation);
    System.out.println("jobType = " + jobType);
    }
    
}
