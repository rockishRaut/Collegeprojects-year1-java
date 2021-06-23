
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire // extends StaffHire calls the parent class and lets one use the attributes of parent class
{
    // Declaring the private variables
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    // calling the constructors for class FullTimeStaffHire
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,  int salary, int workingHour){
        super(vacancyNumber, designation, jobType);  //A super class is called to accept the parameter from the previous class 
        this.salary = salary;   
        this.workingHour = workingHour;
        staffName = "";     // keeping these all variables empty
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
    }
    
    public int getSalary(){  //using getter method for Salary
        return salary;
    }

    public int getWorkingHour(){  //using getter method for workingHour
        return workingHour;
    }

    public String getStaffName(){  //using getter method for staffName
        return staffName;
    }

    public String getJoiningDate(){  //using getter method for joiningDate
        return joiningDate;
    }

    public String getQualification(){   //using getter method for qualification
        return qualification;
    }

    public String getAppointedBy(){  //using getter method for appointedBy
        return appointedBy;
    }

    public boolean getJoined(){    // using getter method for joined
        return joined;
    }

    public void setSalary(int salary){    // using setter method for Salary
        if(getJoined()==false){  //if joined is false it will update it
            this.salary=salary;
        }

        else{     // if joined is true then it will print suitable message
            System.out.println("You are already appointed,so you are not permitted to alter your salary"); 
        }
    }

    public void setWorkingHour(int workingHour){   // using setter method for workingHour
        this.workingHour= workingHour;
    }

    public void setStaffName(String staffName){    // using setter method for staffName
        this.staffName = staffName;
    }

    public void setJoiningDate(String joiningDate){      // using setter method for joiningDate
        this.joiningDate= joiningDate;
    }

    public void setQualification(String qualification){   // using setter method for qualification
        this.qualification = qualification;
    }

    public void setAppointedBy(String appointedBy){        // using setter method for appointedBy
        this.appointedBy= appointedBy;
    }

    public void setJoined(boolean joined){           // using setter method for joined
        this.joined = joined;
    }

    // A method is called which accepts different parameters
    public void HireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (getJoined()== true){      //if joined is true, it will print a suitable message
            System.out.println(staffName + "you have already been appointed on" + joiningDate);
        }
        else {       // if joined is false it will update all given variables
            this.staffName= staffName;
            this.joiningDate = joiningDate;
            this.qualification= qualification;
            this.appointedBy = appointedBy;
            joined = true;
        }
    }

    public void display(){      // this method displays the output of all the attributes of class FullTimeStaffHire
        super.display();    //calling previous class methods
        if (getJoined() == true){    
            System.out.println("staff Name ="+ staffName);
            System.out.println("Salary =" + salary);
            System.out.println("workingHour =" + workingHour);
            System.out.println("joining date =" + joiningDate);
            System.out.println("Qualification = " + qualification);
            System.out.println("Appointed By =" + appointedBy);

        }
    }
   

}
