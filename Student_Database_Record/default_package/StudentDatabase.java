package default_package;

public class StudentDatabase {
	
	// The student database uses an Array of Student Records 
    private int index;
    private StudentRecord [] students = new StudentRecord[7];    

        
    // A constructor method is used when using the class  
    // to create a student database object
    public StudentDatabase() {
        index = 0;
    }
        
    // The class defines methods to access records in the database
    public void addStudent(StudentRecord student ) {
        this.students[index] = student;
        index++;
    }

    public StudentRecord getStudent(int index) {
        return this.students[index];
    }

    public void printStudents() {
    	this.students[0].printRecord();
    	this.students[1].printRecord();
    	this.students[2].printRecord();
    	this.students[3].printRecord();
    	this.students[4].printRecord();
    	this.students[5].printRecord();
    }

}
