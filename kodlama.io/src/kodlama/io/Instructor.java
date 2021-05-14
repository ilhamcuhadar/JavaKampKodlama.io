package kodlama.io;

public class Instructor extends User {
	
	 String instructorNumber;
	
    //Constructor
	 public Instructor() {
		 
	 }
	 
	public Instructor(int id, String name, String lastName, String email, String password, String course,
			String instructorNumber) {
		super(id, name, lastName, email, password, course);
		this.setInstructorNumber(instructorNumber);
		}

	//Getter-Setter
	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
