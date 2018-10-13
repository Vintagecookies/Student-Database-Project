package default_package;

public class StudentRecord {
	
    // A student has the following data fields
    private String firstName;
    private String lastName;
    private String idNumber;
    
        
    // A constructor method is used when using the class  
    // to create student record objects
    public StudentRecord(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
        
    // A class defines methods to access the private data fields
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void printRecord() {
	System.out.println("First: " + firstName + ", Last: " + lastName + ", ID: " + idNumber);
    }

}
