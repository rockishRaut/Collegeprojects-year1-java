
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire   //joining this class with StaffHire class with extends keyword
{
    // declaring different variables for the class PartTimeStaffHire
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    // calling a constructor for class PartTimeStaffHire
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);  // calling the methods and construction of previous class 
        this.workingHour= workingHour;
        this.wagesPerHour= wagesPerHour;
        this.shifts= shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }

    // Using getter methods for all the variables
    public int getWorkingHour(){
        return workingHour;
    }

    public int getWagesPerHour(){
        return wagesPerHour;
    }

    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public String getShifts(){
        return shifts;
    }

    public boolean getJoined(){
        return joined;
    }

    public boolean getTerminated(){
        return terminated;
    }

    // Using setter method for all the parameters
    public void setWorkingHour(int workingHour){
        this.workingHour= workingHour;
    }

    public void setWagesPerHour(int WagesPerHour){
        this.wagesPerHour= wagesPerHour;
    }

    public void setStaffName(String staffName){
        this.staffName= staffName;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate= joiningDate;
    }

    public void setQualification(String qualification){
        this.qualification= qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy= appointedBy;
    }

    public void setShifts(String shifts){
        if (getJoined() == true){   //if joined is true then print a suitable message
            System.out.println("Since you have already been hired, you can not change your shifts");
        }
        else{       // if joined is not true then update a parameter
            this.shifts= shifts;
        }
    }

    public void setJoined(boolean joined){
        this.joined = joined;
    }

    public void setTerminated(boolean terminated){
        this.terminated= terminated;
    }

    // A method is called to hire a PartTimeStaff which accepts different parameters
    public void HirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (getJoined() == true){      // if joined is true then print a suitable message
            System.out.println(staffName + "you have already been appointed on" + joiningDate);
        } 
        else{       // if joined is not true then update all the parameters
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
            terminated = false;
        }
    }

    public void TerminatedStaff() {  
        if(getTerminated() == true){   // if terminated is true then print a suitable message
            System.out.println("you have already been terminated");
        }
        else{    // if terminated is not true then update all these parameters
            staffName = "";
            joiningDate= "";
            qualification= "";
            appointedBy= "";
            joined = false;
            terminated = true;
        }
    }

    // display method shows the output of all the attributes of the PartTimeStaffHire class 
    public void display(){
        super.display();     // this keyword calls the constructor and parameters from the previous class
        if(getJoined()== true){  // if joined is true then print all of these
            System.out.println("name of the staff = " + staffName);
            System.out.println("wages per hour =" + wagesPerHour);
            System.out.println("Working hour =" + workingHour);
            System.out.println("Joining date = " + joiningDate);
            System.out.println("qualification of staff =" + qualification);
            System.out.println("This staff is appointed by" + appointedBy);
            System.out.println("Income per day =" + workingHour*wagesPerHour);
            
        }

    }

}
