package default_package;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		StudentDatabase studentDB = new StudentDatabase();

		StudentRecord newStudent = new StudentRecord("Daniel", "Gopal", "1234");
		studentDB.addStudent(newStudent);
		
		newStudent = new StudentRecord("Kiran", "Hart", "5678");
		studentDB.addStudent(newStudent);

		newStudent = new StudentRecord("Antonio", "N-J", "2468");
		studentDB.addStudent(newStudent);

		newStudent = new StudentRecord("Robin", "Saran", "1357");
		studentDB.addStudent(newStudent);

		newStudent = new StudentRecord("Rahul", "Tailor", "7899");
		studentDB.addStudent(newStudent);

		newStudent = new StudentRecord("Calvin", "Ye", "1111");
		studentDB.addStudent(newStudent);

		System.out.println("Student DAtabase Printout");
		System.out.println("=========================");
		studentDB.printStudents();
		
		System.out.println("=========================");
		
		String s = "Please follow the instructions.";
		Scanner scan = new Scanner(s);
        //Check if the scanner has a token
		System.out.println("=========================");
        System.out.println("ADMIN ACCESS = " + scan.hasNext());
        System.out.println("=========================");
        
        //Print the string  
        System.out.println(scan.nextLine());  
        scan.close();
        System.out.println("--------Enter New Details-------- ");  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter new first name: ");    
        String firstname = in.next();
        System.out.print("Enter new last name: ");
        String lastname = in.next();
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.print("Enter new age: ");  
        int age = in.nextInt();  
        System.out.println("Age: " + age);
        System.out.print("Enter a new grade: ");
        int grade = in.nextInt();
        System.out.println("Grade: " + grade);
        
        //Generating new student ID
        System.out.print("Do you want to make a new ID for this student? (Yes or No): ");
        String answer = in.next();
        if(answer  == "Yes") {
        	UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();
        	System.out.println("Generating Unique ID...");
        	System.out.println(randomUUIDString);         
        } else {
        	System.out.println("Alright, the student's ID will remain the same.");
        }
        in.close();
	}

}
